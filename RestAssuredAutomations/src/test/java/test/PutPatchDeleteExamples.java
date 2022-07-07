package test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class PutPatchDeleteExamples {
	@Test
	public void Test_03() {
		
          baseURI = "https://reqres.in/api";
		
		
		JSONObject request = new JSONObject();
		System.out.println(request.toJSONString());
		
		request.put("name" ,"Mohan");
		request.put("Job", "Manager");
		 
		given().
			body(request.toJSONString())
		.when()
			   .put("/users/2")
		.then().statusCode(200).log().all();
			
		
	}
	@Test
	public void Test_patch() {
		
        baseURI = "https://reqres.in/api";
		
		
		JSONObject request = new JSONObject();
		System.out.println(request.toJSONString());
		
		request.put("name" ,"Mohan");
		request.put("Job", "Manager");
		 
		given().
			body(request.toJSONString())
		.when()
			   .patch("/api/users/2")
		.then().statusCode(200).log().all();
			
		
	}
	@Test
	public void Test_delete() {
		baseURI = "https://reqres.in";
		
		when().
		 delete("/api/users/2").
		then().
		statusCode(204)
		.log().all();
	}
}
