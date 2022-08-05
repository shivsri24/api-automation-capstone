package com.octrix.dummyapi.post;

import okhttp3.Response;

import java.io.IOException;

public class DummyPostStateManager {
    /**
     * State Managers will be used to change the state of the entity.
     */
    DummyPostClient dummyPostClient = new DummyPostClient();

    public Response deletePost(String id) throws IOException {
        return dummyPostClient.deletePost(id);
    }
}
