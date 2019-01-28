package com.emc.ideaforce.controller;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ResetPwdDto {

    @NotEmpty
    @ValidEmail
    private String emailId;

}
