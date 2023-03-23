package com.practice.broadcast.receiver;

import java.io.Serializable;

public class Song implements Serializable {
    private String title;
    private String singer;
    private Integer image;
    private Integer resource;

    public Song(String title, String singer, Integer image, Integer resource) {
        this.title = title;
        this.singer = singer;
        this.image = image;
        this.resource = resource;
    }

    public String getTitle() {
        return title;
    }

    public String getSinger() {
        return singer;
    }

    public Integer getImage() {
        return image;
    }

    public Integer getResource() {
        return resource;
    }
}
