package GetAPIRequest;

import org.testng.annotations.Test;

import io.restassured.config.LogConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.response.ValidatableResponse;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

class Tests_Get_SingleUSer 
{
    @Test
	public void getSingleEmail() throws FileNotFoundException 
	{
		given()
		.when()
		.get("https://reqres.in/api/users/2")
		.then()
		.body("data.email",equalTo("janet.weaver@reqres.in"))
        .statusCode(200);
		

	}
}

