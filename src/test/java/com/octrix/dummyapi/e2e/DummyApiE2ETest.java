package com.octrix.dummyapi.e2e;

import com.octrix.dummyapi.post.*;
import com.octrix.dummyapi.user.*;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.io.IOException;

public class DummyApiE2ETest {

    DummyUserFactory dummyUserFactory = new DummyUserFactory();
    DummyUserDataManager dummyUserDataManager = new DummyUserDataManager();
    DummyUserStateManager dummyUserStateManager = new DummyUserStateManager();

    DummyPostFactory dummyPostFactory = new DummyPostFactory();
    DummyPostDataManager dummyPostDataManager = new DummyPostDataManager();
    DummyPostStateManager dummyPostStateManager = new DummyPostStateManager();

    @Test(groups={"sanity", "post"}, priority = 1)
    public void createPostAndDeletePost() throws IOException {
        Response createPostResponse = dummyPostFactory.createPost();
        System.out.println(createPostResponse.body().string());
        Response getPostResponse = dummyPostDataManager.getPost("");
        JSONObject jsonObject = new JSONObject(getPostResponse.body().string());
        JSONArray arrayObj = jsonObject.getJSONArray("data");
        JSONObject getPostObj = arrayObj.getJSONObject(0);
        String id = getPostObj.getString("id");
        System.out.println(getPostObj);
        Response deletePostResponse = dummyPostStateManager.deletePost(id);
        System.out.println(deletePostResponse.body().string());
    }

    @Test(groups={"sanity", "user"}, priority = 1)
    public void createUserAndGetUserUnderMyAccount() throws IOException {
        Response createUserResponse = dummyUserFactory.createUser("Shivansh", "Srivastava","shivansh@swiggy.in");
        System.out.println(createUserResponse.body().string());
        Response getAllUserResponse = dummyUserDataManager.getAllUsers();
        System.out.println(getAllUserResponse.body().string());
        Response getAllUserUnderMyAccount = dummyUserDataManager.getAllUserUnderMyAccount(1);
        System.out.println(getAllUserUnderMyAccount.body().string());

    }
}
