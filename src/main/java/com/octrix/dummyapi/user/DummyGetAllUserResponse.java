package com.octrix.dummyapi.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class DummyGetAllUserResponse {

    @JsonProperty("data")
    private List<Data> dataList;
    @Setter
    private int statusCode;
    private int total;
    private int page;
    private int limit;

    @Getter
    private static class Data {
        private String id;
        private String title;
        private String firstName;
        private String lastName;
        private String picture;
    }
}