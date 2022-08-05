package com.octrix.dummyapi.post;

import okhttp3.Response;

import java.io.IOException;

public class DummyPostDataManager {
    /**
     * Data managers will provide data for particular entity.
     */
    DummyPostClient dummyPostClient = new DummyPostClient();

    public Response getPost(String id) throws IOException {
        return dummyPostClient.getPost(id);
    }
}
