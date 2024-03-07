package tests;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Patch {

	@Test

	public void patch(){
		baseURI="https://reqres.in";
		JSONObject request = new JSONObject();
		request.put("name", "KratosStreet");
		request.put("job", "SE");

		System.out.println(request.toJSONString());

		given().
		header("Content-Type","application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("/api/users/2").
		then().
		statusCode(200).log().all();
	}
	
@Test
	public void delete(){
		baseURI="https://reqres.in";

		when().
		delete("/api/users/2").
		then().
		statusCode(204).log().all();
	}
}
