package com.octrix.dummyapi.post;

import okhttp3.Response;

import java.io.IOException;

public class DummyPostFactory {
    /**
     * Factories are the interfaces provided to users and hiding all the core logics,
     * factory will expose methods for creating data.
     */
    DummyPostClient dummyPostClient = new DummyPostClient();

    public Response createPost() throws IOException {
        return dummyPostClient.createPost();
    }
}
