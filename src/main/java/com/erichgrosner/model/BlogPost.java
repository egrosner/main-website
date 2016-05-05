package com.erichgrosner.model;

import lombok.*;

import org.joda.time.*;

/**
 * Created by egros on 4/5/2016.
 */
@Builder
@Data
public class BlogPost {
    private String title;
    private String body;
    private DateTime postDate;

    public String getPostDateDisplay() {
        return postDate.toString("YYYY-MM-dd");
    }

    private String titleCaption;
    private String category;
    private String userName;
    private String userAvatar;

    private String postPhoto;

}
