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
import java.util.Set;
import java.util.HashSet;
public class Tests_Get {

	/*
	 * @Test public void getFirstNames() {
	 * 
	 * given() .header("Content-Type","application/json")
	 * .params("Key","Abhijat Sharma") .get("https://reqres.in/api/users?page=2")
	 * .then() .body("data.first_name",hasItems("Michael","Lindsay","Tobias"))
	 * .statusCode(200) .log().all();
	 * 
	 * 
	 * }
	 */
	
	@Test
	public void getEmail() throws FileNotFoundException {
		//Set<String> headers = new HashSet<String>();
		// headers.add("X-Api-Key");
		// headers.add("Accept");
		
		

		
		PrintStream log =new PrintStream(new FileOutputStream("resterLog.txt"));
		
		
		given() 
		.filter(RequestLoggingFilter.logRequestTo(log))
		
		.filter(ResponseLoggingFilter.logResponseTo(log))
		 
		.config(config().logConfig(LogConfig.logConfig().blacklistHeader("Request method")))
	     .when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.body("data.email[0]",equalTo("michael.lawson@reqres.in"))
	//	.body("data.email",hasItems("michael.lawson@reqres.in","lindsay.ferguson@reqres.in"))
		.statusCode(200);
		

	}


}
