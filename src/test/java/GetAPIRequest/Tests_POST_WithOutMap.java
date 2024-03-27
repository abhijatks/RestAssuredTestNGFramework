package GetAPIRequest;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tests_POST_WithOutMap {
	
	@Test
	public void test1_Post()
	{
		
		JSONObject request = new JSONObject();
		request.put("name","Abhijat Sharma");
		request.put("job", "QA Professional");
		System.out.println(request);
		System.out.println(request.toJSONString());
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON)
		
		.body(request
				.toJSONString()
				).when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
		
	}


}
