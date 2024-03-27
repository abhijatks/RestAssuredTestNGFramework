package GetAPIRequest;


import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Tests_Delete {
	
		@Test
		public void test1_Delete()
		{
			when()
			.delete("https://reqres.in/api/users/2")
			.then()
			.statusCode(204)
			.log().all();
		}

	}






