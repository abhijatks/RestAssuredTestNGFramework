package GetAPIRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class Test01_GetData {

	/*@Test
	void test_01() {

		Response response =RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString());
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getContentType());
		System.out.println(response.getTime());
		Assert.assertEquals(response.getStatusCode(), 200);

	}*/
	
	  @Test 
	  void test_02() { 
		given().get("https://reqres.in/api/users?page=2")
	  .then() .statusCode(200) .body("data.email[1]",equalTo("lindsay.ferguson@reqres.in"));
	  
	  
	  
	  }
	 


}
