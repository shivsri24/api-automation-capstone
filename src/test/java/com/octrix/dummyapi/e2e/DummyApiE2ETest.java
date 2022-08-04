package com.octrix.dummyapi.e2e;

import com.octrix.dummyapi.post.*;
import com.octrix.dummyapi.user.*;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class DummyApiE2ETest {

    DummyPostClient dummyPostClient = new DummyPostClient();
    DummyUserClient dummyUserClient = new DummyUserClient();
    DummyPostUtil dummyPostUtil = new DummyPostUtil();
    DummyUserUtil dummyUserUtil = new DummyUserUtil();
    DummyPostValidator dummyPostValidator = new DummyPostValidator();
    DummyUserValidator dummyUserValidator = new DummyUserValidator();
    @Test(groups={"sanity", "post"}, priority = 1)
    public void createPostAndDeletePost(){
        DummyPostModel body=new DummyPostModel.Builder().build();
        DummyPostResponse postResponse=dummyPostUtil.createPost(body);
        dummyPostValidator.assertPostDetails(body);
        String id=postResponse.getId();
        Response response= dummyPostClient.deletePost(id);
    }

    @Test(groups={"sanity", "user"}, priority = 1)
    public void createUserAndDeleteUser(){
        DummyUserModel body=new DummyUserModel.Builder().build();
        DummyCreateUserResponse userResponse=dummyUserUtil.dummyCreateUserResponse(body);
        dummyUserValidator.assertUserDetails(body);
        String id=userResponse.getId();
        Response response= dummyUserClient.getAllUsersUnderMyAccountResponse();
        System.out.println("All users are:" + response);
    }
}
