package March11;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class RestassuredDemo {
	int id;
	@Test(priority=1)
	void getUser() {
		
		given()
		
		.when()
		.get("https://reqres.in/api/users?page=2")
		
		.then()
		.statusCode(200)
		.body("page",equalTo(2))
		.log().all();
		
	}
	
	@Test(priority=2)
	void createUser() {
		
		HashMap hs=new HashMap();
		hs.put("name", "reddy");
		hs.put("job", "QA");
		
		given()
		.contentType("application/json")
		.body(hs)
		
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		
		/*.then()
		.statusCode(201)
		.log().all();*/
		
	}
	
	@Test(priority=3)
	void updateUser() {
		HashMap hs=new HashMap();
		hs.put("name", "reddy");
		hs.put("job", "testing");
		
		given()
		.contentType("application/json")
		.body(hs)
		
		.when()
		.put("https://reqres.in/api/users/"+id)
		
		.then()
		.statusCode(200)
		.log().all();
		
		
	}


}
