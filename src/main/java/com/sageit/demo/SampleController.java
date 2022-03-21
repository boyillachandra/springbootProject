package com.sageit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Sample")
public class SampleController {
	
	@Autowired
	private SampleService service;
	
	@GetMapping("/getMeesage")
	public String getMessage() {
		System.out.println("SampleController : start:");
		String data = service.getData();
		System.out.println("SampleController : ends:");
		return data;
	}

}
