package com.erichgrosner.model;

import lombok.*;

import java.util.Date;

/**
 * Created by egros on 4/5/2016.
 */
public class BlogPost {
    @Getter @Setter private String title;
    @Getter @Setter private String body;
    @Getter @Setter private Date postDate;
    @Getter @Setter private String titleCaption;
    @Getter @Setter private String category;
    @Getter @Setter private String userName;

}
