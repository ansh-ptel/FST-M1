package Activities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class Activity2 {
    final static String ROOT_URI = "https://petstore.swagger.io/v2/user";

    @Test(priority=1)
    public void addNewUserFromFile() throws IOException {
        FileInputStream inputJSON = new FileInputStream("C:\\Users\\0021ZY744\\IdeaProjects\\FST_Selenium\\src\\test\\java\\Activities\\userinfo.json");
        String reqBody = new String(inputJSON.readAllBytes());

        Response response =
                given().contentType(ContentType.JSON)
                        .body(reqBody)
                        .when().post(ROOT_URI);

        inputJSON.close();
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("8701"));
    }
    @Test(priority=2)
    public void getUserInfo() {
        File outputJSON = new File("C:\\Users\\0021ZY744\\IdeaProjects\\FST_Selenium\\src\\test\\java\\Activities\\userGETResponse.json");
        Response response =
                given().contentType(ContentType.JSON)
                        .pathParam("username", "evkiran")
                        .when().get(ROOT_URI + "/{username}");
        String resBody = response.getBody().asPrettyString();
        try {
            outputJSON.createNewFile();
            FileWriter writer = new FileWriter(outputJSON.getPath());
            writer.write(resBody);
            writer.close();
        } catch (IOException excp) {
            excp.printStackTrace();
        }
        response.then().body("id", equalTo(8701));
        response.then().body("username", equalTo("evkiran"));
        response.then().body("firstName", equalTo("Kiran"));
        response.then().body("lastName", equalTo("Venkat"));
        response.then().body("email", equalTo("kiranvenkat@mail.com"));
        response.then().body("password", equalTo("password1234"));
        response.then().body("phone", equalTo("9812763412"));
    }
    @Test(priority=3)
    public void deleteUser() throws IOException {
        Response response =
                given().contentType(ContentType.JSON)
                        .pathParam("username", "evkiran")
                        .when().delete(ROOT_URI + "/{username}");
        response.then().body("code", equalTo(200));
        response.then().body("message", equalTo("evkiran"));
    }
}