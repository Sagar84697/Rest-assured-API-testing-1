package March12;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*; 
public class jsonresponsedata {
	
	/*@Test
	void jsonresponse() {
		 given()
		.contentType("ContentType.JSON")
		
		.when()
		.get("http://localhost:3000/countries")
		
		.then()
		.statusCode(200)
		.header("Content-Type","application/json")
		.body("[2].id",equalTo("29c3"));
	}*/
	
	@Test
	void assertjsonresponse() {
		
		Response res=given()
		
		.when()
		.get("http://localhost:3000/countries");
		
		Assert.assertEquals(res.getStatusCode(),200);
		Assert.assertEquals(res.header("Content-Type"),"application/json");
		
		String idnum=res.jsonPath().get("[2].id").toString();
		Assert.assertEquals(idnum,"29c3");
	}

	
	
}
