package com.sageit.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

	@Autowired
	private SampleDao dao;

	public String getData() {
		System.out.println("SampleService start::");
		String data = dao.getDataFromDB();
		System.out.println("SampleService end::");
		return data;
	}

}
