package com.octrix.dummyapi.post;

import org.testng.Assert;

public class DummyPostValidator {

    DummyPostResponse dummyPostResponse = new DummyPostResponse();
    public void assertPostDetails(DummyPostModel body) {
        Assert.assertEquals(dummyPostResponse.getStatusCode(),200);
        Assert.assertEquals(dummyPostResponse.getText(),body.getText());
        Assert.assertEquals(dummyPostResponse.getImage(),body.getImage());
        Assert.assertEquals(dummyPostResponse.getOwner(),body.getOwner());
        Assert.assertEquals(dummyPostResponse.getTags(),body.getTags());
        Assert.assertEquals(dummyPostResponse.getLikes(),body.getLikes());
    }
}
