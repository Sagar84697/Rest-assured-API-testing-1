package March11;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

//import java.util.HashMap;
public class DiffwaytocreatePost {
	
/*	@Test(priority=1)
	void postusinghashmap(){
		
		HashMap data=new HashMap();
		data.put("name", "kane");
		data.put("location", "france");
		data.put("phone", "12345");
		
		String courseA[]= {"c","c++"};
		data.put("courses", courseA);
		
		given()
		.contentType("application/json")
		.body(data)
		
		.when()
		.post("http://localhost:3000/countries")
		
		.then()
		.statusCode(201)
		.body("name", equalTo("kane"))
		.body("location", equalTo("france"))
		.body("courses[0]",equalTo("c"))
		.log().all();
		
		
	} */
	

 @Test(priority=1)
	void postusingJsonlibrary(){
	 
	 JSONObject data=new JSONObject();
	 data.put("name", "india");
	 data.put("code", "24");
		
		given()
		.contentType("application/json")
		.body(data.toString())
		
		.when()
		.post("http://localhost:3000/countries")
		
		.then()
		.statusCode(201)
		.log().all();
		
		
	}
	
	/*@Test()
	void deleteuser() {
		given()
		
		.when()
		.delete("http://localhost:3000/countries/f062")
		
		 .then()
		 .statusCode(200);
	}*/

}
