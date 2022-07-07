package test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


public class GetPostExamples {
	
	@Test
	public void testGet() {
		baseURI = "https://reqres.in/api";
		
		Map<String,Object>map = new HashMap <String,Object>();
		
//		map.put("name" ,"Mohan");
//		map.put("Job", "Manager");
		
		JSONObject request = new JSONObject();
		System.out.println(request.toJSONString());
		
		request.put("name" ,"Mohan");
		request.put("Job", "Manager");
		
		given().
			body(request.toJSONString())
		.when()
			   .post("/users")
		.then().statusCode(201).log().all();
		
		
	}

}
