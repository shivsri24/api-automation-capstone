package com.octrix.dummyapi.user;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DummyCreateUserResponse {

    private String id;
    private String title;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String dateOfBirth;
    private String registerDate;
    private String phone;
    private String picture;
    private String updatedDate;
    @Setter
    private int statusCode;
    private Location location;

    @Getter
    private static class Location {
        private String street;
        private String city;
        private String state;
        private String country;
        private String timezone;
    }
}