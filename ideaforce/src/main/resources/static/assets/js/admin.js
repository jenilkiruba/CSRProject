var table;
$(document).ready(function() {
    table = $('#unapproved-requests').DataTable();
    $('.row').attr('style','width:100%');
} );

function approveRequest(e){
    $("#flash_message").html("");

    var challengeId = e.id;
    var challengeName = e.name;
    $.ajax('/approve/' + challengeId,
        {
            contentType: 'application/json', // type of response data
            success: function (data,status,xhr) {   // success callback function
                $('#flash_message').html('<div class="alert alert-success"><a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a><strong>Success!</strong> Request approved for challenge "' + challengeName + '".</div>');
                table.row($("#row" + challengeId)).remove().draw();
            },
            error: function (jqXhr, textStatus, errorMessage) { // error callback
                $('#flash_message').html('<div class="alert alert-danger"><a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a><strong>Faiure - </strong> ' + errorMessage + ' </div>');
            }
        });
}

function handleComments(e) {
    $("#flash_message").html("");

    var challengeId = e.id;
    var challengeName = e.name;

    $.ajax('/viewcomments/' + challengeId,
        {
            contentType: 'application/json', // type of response data
            success: function (data,status,xhr) {   // success callback function
                $('.modal-title').html("Comment challenge <strong>'" + challengeName + "'</strong>");
                $('.modal-body').html(data);
                $('.modal').show();
            },
            error: function (jqXhr, textStatus, errorMessage) { // error callback
                $('#flash_message').html('<div class="alert alert-danger"><a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a><strong>Faiure - </strong> ' + errorMessage + ' </div>');
            }
        });
}

function submitComment() {
    $("#flash_message").html("");

    $("#comment_form").submit(function(e) {

        e.preventDefault(); // avoid to execute the actual submit of the form.

        var form = $(this);
        var url = form.attr('action');

        $.ajax({
            type: "POST",
            url: url,
            data: form.serialize(), // serializes the form's elements.
            success: function(data)
            {
                $('#flash_message').html('<div class="alert alert-success"><a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a><strong>Success!</strong> Comment added.</div>');
            },
            error: function (jqXhr, textStatus, errorMessage) { // error callback
                $('#flash_message').html('<div class="alert alert-danger"><a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a><strong>Faiure - </strong> ' + errorMessage + ' </div>');
            }
        });


    });
    closeModal();
    $('#comment_form').trigger('submit');
}

function viewDetails(e){
    var storyId = e.id;
    window.location.href = "/viewdetails/"+storyId;

}

function closeModal() {
    $('.modal').hide();
}
