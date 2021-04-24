package apiProject.elementProperties.restBase;

import apiProject.elementProperties.object.Users;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class Preparations {
    static Users users;
    static Response response;
    static String postResult;
    static String putResult;

    @Step("Preparations before deleting test")
    public static void deletePrep(){
        users = new Users.Builder().setId(753).setUsername("delete").setEmail("[]").setPassword("zxc").setUserStatus(5).build();
        Requests.post(users);
        Requests.delete("delete");
    }

    @Step("Preparations before posting test")
    public static Response postPrep(){
        users = new Users.Builder().setId(754).setUsername("post").setEmail("").setPassword("zxc").setUserStatus(5).build();
        return response = Requests.post(users);
    }

    @Step("Preparations before getting test")
    public static Response getPrep(){
        users = new Users.Builder().setId(755).setUsername("get").setEmail("").setPassword("zxc").setUserStatus(5).build();
        Requests.post(users);
        return response = Requests.get("get");
    }

    @Step("Preparations before putting test")
    public static String[] putPrep(){
        users = new Users.Builder().setId(756).setUsername("put").setEmail("").setPassword("zxc").setUserStatus(5).build();
        Requests.post(users);
        postResult = Requests.get("put").prettyPrint();
        users = new Users.Builder().setId(756).setUsername("put").setEmail("[]").setPassword("zxccc").setUserStatus(5).build();
        response = Requests.update("pit", users);
        putResult = Requests.get("put").prettyPrint();
        String[] responses = new String[2];
        responses[0] = postResult;
        responses[1] = putResult;
        return responses;
    }
}
