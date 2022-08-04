package com.octrix.dummyapi.user;

import org.testng.Assert;

public class DummyUserValidator {
    DummyCreateUserResponse dummyCreateUserResponse = new DummyCreateUserResponse();

    public void assertUserDetails(DummyUserModel body) {
        Assert.assertEquals(dummyCreateUserResponse.getFirstName(),body.getFirstName());
        Assert.assertEquals(dummyCreateUserResponse.getLastName(),body.getLastName());
        Assert.assertEquals(dummyCreateUserResponse.getEmail(),body.getEmail());
        Assert.assertEquals(dummyCreateUserResponse.getStatusCode(),200);
    }
}
