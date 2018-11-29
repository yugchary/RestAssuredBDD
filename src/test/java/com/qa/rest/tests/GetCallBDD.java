package com.qa.rest.tests;

import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;


public class GetCallBDD {
	
	
	@Test
	public void test_numberofCircuits() {
		
		
		given().
		when().
			get("http://ergast.com/api/f1/2017/circuits.json").			
		then().
			assertThat().			
			statusCode(201);
			
			//and().
			
			//body("MRData.CircuitTable.Circuits.circuitId", hasSize(20));
		
		
		
		
	}
	

}
