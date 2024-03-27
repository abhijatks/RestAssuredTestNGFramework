package GetAPIRequest;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tests_Patch {
	
	
		@Test
		public void test1_Patch()
		{
			Map<String,Object> map = new HashMap<String,Object>();
			map.put("name", "Abhijat Sharma");
			map.put("job", "QA Professional");
			System.out.println(map);
			
			JSONObject request = new JSONObject(map);
			System.out.println(request);
			System.out.println(request.toJSONString());
			given()
			.header("Content-Type","application/json")
			.contentType(ContentType.JSON).accept(ContentType.JSON)
			
			.body(request
					.toJSONString()
					).when()
			.patch("https://reqres.in/api/users/2")
			.then()
			.statusCode(200)
			.log().all();
		}

	}






