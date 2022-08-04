package com.octrix.dummyapi.user;

import org.testng.Assert;

public class DummyUserValidator {
    public void assertUserDetails(DummyUserModel body, DummyCreateUserResponse userResponse) {
        Assert.assertEquals(userResponse.getFirstName(),body.getFirstName());
        Assert.assertEquals(userResponse.getLastName(),body.getLastName());
        Assert.assertEquals(userResponse.getEmail(),body.getEmail());
        Assert.assertEquals(userResponse.getStatusCode(),200);
    }
}
