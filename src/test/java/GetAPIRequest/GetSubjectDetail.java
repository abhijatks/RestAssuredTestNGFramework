package GetAPIRequest;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;


public class GetSubjectDetail {
	
	
	@Test(enabled=false)
	public void test_getSubjects() {
	int statuscode=200;
		
		given().params("name","Automation").get("/subjects").then().statusCode(statuscode).log().all();
		}
	
	
	@Test(enabled=false)
	public void test_getUsers() {
	int statuscode=200;
		given().get("/users").then().statusCode(statuscode).log().all();
		}
	
	@Test(enabled=false)
	public void test_PostUsers() {
	int statuscode = 201;

	baseURI="http://localhost:3000";
	    JSONObject request =new JSONObject();
	    request.put("firstName", "Vaibhav");
	    request.put("lastName", "Sharma");
	    request.put("subjectId", 1);
	    request.put("id", 5);
		
		given().contentType(ContentType.JSON).accept(ContentType.JSON).header("Content-Type","application/json").body(request.toJSONString())
		.when().post("/users").then().statusCode(statuscode).log().all();
		}
	
	@Test(enabled=false)
	public void test_PatchUsers() {
	int statuscode = 200;

	baseURI="http://localhost:3000";
	    JSONObject request =new JSONObject();
	    request.put("firstName", "Abhijat Kishor");
	   
		given().contentType(ContentType.JSON).accept(ContentType.JSON).header("Content-Type","application/json").body(request.toJSONString())
		.when().patch("/users/1").then().statusCode(statuscode).log().all();
		}
	
	@Test(enabled=false)
	public void test_PutUsers() {
	int statuscode = 200;

	baseURI="http://localhost:3000";
	    JSONObject request =new JSONObject();
	    
	    request.put("firstName", "Vaibhav");
	    request.put("lastName", " Kishor Sharma");
	    request.put("subjectId", 2);
	    
		given().contentType(ContentType.JSON).accept(ContentType.JSON).header("Content-Type","application/json").body(request.toJSONString())
		.when().put("/users/5").then().statusCode(statuscode).log().all();
		}
	
	@Test()
	public void test_deleteUser() {
	int statuscode = 200;

	baseURI="http://localhost:3000";
	    
	    
		when().delete("/users/3").then().statusCode(statuscode).log().all();
		}

}
