package GetAPIRequest;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;



public class GetAPIResponse {

	@Test
	public void GetAPIResponse() {
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).when().get("https://reqres.in/api/users/2").then().body("data.email",equalTo("janet.weaver@reqres.in")).statusCode(200).log().all();
		
		
	}
	
}
