package com.octrix.dummyapi.post;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.List;

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
    private int statusCode;

    private static class User {
        private String id;
        private String firstName;
        private String lastName;
    }
}