package GetAPIRequest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;

import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DataForPost {


	@DataProvider(name="DataForPost") public Object[] [] dataForPost() {

		return new Object[][] { {"Albert","Einsten",2}, {"Thomas","Edison",1},
			{"James","Scott",1}, {"Abhijat","Sharma",2}, {"Bipra","Sharma",1} }; 
			}



	@Test(dataProvider="DataForPost") public void test_PostUsers(String
			firstName,String lastName,int subjectId) { int statuscode = 201;

			baseURI="http://localhost:3000"; JSONObject request =new JSONObject();
			request.put("firstName", firstName); request.put("lastName", lastName);
			request.put("subjectId", subjectId);


			given().contentType(ContentType.JSON).accept(ContentType.JSON).header(
					"Content-Type","application/json").body(request.toJSONString())
			.when().post("/users").then().statusCode(statuscode).log().all(); }

	@DataProvider(name="DeleteData")
	public Object[] dataForDelete() {

		return new Object[] {
				2,3,4,5,6

		};

	}



	@Test(dataProvider="DeleteData")
	public void test1_Delete(int userId)
	{
		baseURI="http://localhost:3000";
		when()
		.delete("/users/" +userId)
		.then()
		.statusCode(200)
		.log().all();
	}

}
