package com.octrix.dummyapi.post;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class DummyPostResponse {
    private String text;
    private String image;
    private User owner;
    private String id;
    private String link;
    private String publishDate;
    private String updatedDate;
    private List<String> tags;
    private int likes;
    @Setter
    private int statusCode;

    @Getter
    private static class User {
        private String id;
        private String firstName;
        private String lastName;
    }
}