package March12;
import org.testng.annotations.Test;

import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

//import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class headers {

	//@Test
	void header(){
		
		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.header("Content-Type", "text/html; charset=ISO-8859-1");	
		
	}
	
	@Test
	void headers(){
		
		Response res=given()
		
		.when()
		.get("https://www.google.com/");
		
		Headers allheaders=res.headers();
		System.out.println("all headers==>"+allheaders);
		
		for(Header hd:allheaders) {
			System.out.println(hd.getName()+"   "+hd.getValue());
			
		}
		
		
		
		
	}

}
