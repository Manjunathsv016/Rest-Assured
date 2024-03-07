package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class PostExample {

	@Test
	public void test() {
		baseURI="https://reqres.in";
	JSONObject request = new JSONObject();
	request.put("name", "Kratos");
	request.put("job", "ASE");

	System.out.println(request.toJSONString());
	
	given().
	   header("Content-Type","application/json").
	   contentType(ContentType.JSON).
	   accept(ContentType.JSON).
	   body(request.toJSONString()).
	when().
	  post("/api/users").
	then().
	  statusCode(201).log().all();
	}
}
