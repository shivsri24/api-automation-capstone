# Capstone Project 
This is the REST API project, which has two End to End Test cases. 
This has a dependency on: 
* okhttp3
* json
* testng
* dummy-api

### Steps to run the E2E Test
1. Clone the repo.
2. Set it up in local, build gradle.
3. You need to login to the Dummy API Dashboard.
4. Get the App-id
5. Add "app-id" in the key key of the modify configuration > env. variables, and add the value for the same.
6. Run the test.

### E2E Test
The E2E Test Includes :
* createUserAndGetUserUnderMyAccount 
* createPostAndDeletePost

There are two separate clients for user and post related services.

