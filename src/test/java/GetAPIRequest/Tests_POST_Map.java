package GetAPIRequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tests_POST_Map {
	
	@Test
	public void test1_Post()
	{
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("name", "Bipra Sharma");
		map.put("job", "QA Professional");
		System.out.println(map);
		
		JSONObject request = new JSONObject(map);
		System.out.println(request);
		System.out.println(request.toJSONString());
		given()
		.header("Content-Type","application/json")
		.contentType(ContentType.JSON).accept(ContentType.JSON).
		
		 body(request
				.toJSONString()
				).when()
		.post("https://reqres.in/api/users")
		.then()
		.statusCode(201)
		.log().all();
	}

}
