package Activities;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RESTgithub {
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    String sshKey;
    int sshKeyId;

    @BeforeClass
    public void setUp() {
        requestSpec = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "token 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")
                .setBaseUri("https://api.github.com")
                .build();
        sshKey = "ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAIFpYNxLJeFdJsjGiY0Hm5qNtAMTzhKq5vbOmUUhhZqwy";
    }
    @Test(priority = 1)
    public void addKeys() {
        String reqBody = "{\"title\": \"B44-M1-RA\", \"key\": \"" + sshKey + "\" }";
        Response response = given().spec(requestSpec)
                .body(reqBody)
                .when().post("/user/keys");
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response);
        System.out.println(response.getStatusCode());
        sshKeyId = response.then().extract().path("id");
        response.then().statusCode(201);
    }
    @Test(priority = 2)
    public void getKeys() {
        Response response = given().spec(requestSpec)
                .when().get("/user/keys");
        System.out.println(response.headers());
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());

        response.then().statusCode(200);
    }
    @Test(priority = 3)
    public void deleteKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("keyId", sshKeyId).when().delete("/user/keys/{keyId}");
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        System.out.println(response.getStatusCode());
        response.then().statusCode(204);
    }
}