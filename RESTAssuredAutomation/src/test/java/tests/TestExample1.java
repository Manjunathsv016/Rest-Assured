package tests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TestExample1 {

	@Test
	public void test() {
		Response  response = get("https://reqres.in/api/users/2");
		baseURI="https://reqres.in";
		given()
		 .get("/api/users/2").
		then()
		 .statusCode(200).body("data.id", equalTo(2));
	}
}
