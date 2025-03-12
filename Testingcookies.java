package March11;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.Map;


public class Testingcookies {
	
	
/*	@Test
	void cookies(){
		
		given()
		
		.when()
		.get("https://www.google.com/")
		
		.then()
		.cookie("AEC", "AVcja2fbsMHiEpJc2H77_buCNX1G0lydbMEyKv0CtEV0j9thA65IbNylsOQ")
		.log().all();	
		
	}*/
	
	@Test
	void getcookies() {
		
		Response res=given()
		
		.when()
		.get("https://www.google.com/");
		
		//String cookie_value=res.getCookie("AEC");
		//System.out.println("cookie value is==>"+cookie_value);
		
		Map<String,String>all_cookies=res.getCookies();
		//System.out.println("all_cookies==>"+all_cookies);
		//System.out.println(all_cookies.keySet());
		
		for(String k:all_cookies.keySet()) {
			String cookie_value=res.getCookie(k);
		    System.out.println(k+ "    "+ all_cookies);
		}
		
		
		
	
	
		 
		
		
	}
	
	

}
