package com.emc.ideaforce.controller;

import com.emc.ideaforce.model.StoryImage;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class StoryDto {

    private String id;
    private String challengeId;

    private String userId;

    private String description;

    private String video;
    private List<StoryImageDto> images = new ArrayList<>();

    private boolean approved;

    private Date created;

    private Date lastUpdated;

    @Data
    private class StoryImageDto {
        private String imageId;
        private byte[] data;
    }

    public void setStoryImageDtos(List<StoryImage> storyImages) {
        List<StoryImageDto> storyImageDtos = new ArrayList<>();
        for (StoryImage storyImage: storyImages) {
            StoryImageDto storyImageDto = new StoryImageDto();
            storyImageDto.setImageId(storyImage.getImageId());
            storyImageDto.setData(storyImage.getData());
            storyImageDtos.add(storyImageDto);
        }
        this.images = storyImageDtos;
    }
}
