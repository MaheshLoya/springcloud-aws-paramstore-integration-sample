package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	private String propFromAWSParamStore;
	
	@GetMapping
	public String testMethod() {
		
		return "{\"test\":\""+this.propFromAWSParamStore+"\"}";
	}

	public String getPropFromAWSParamStore() {
		return propFromAWSParamStore;
	}

	public void setPropFromAWSParamStore(String propFromAWSParamStore) {
		this.propFromAWSParamStore = propFromAWSParamStore;
	}

}
