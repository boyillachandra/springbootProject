package com.sageit.demo;

import org.springframework.stereotype.Repository;

@Repository
public class SampleDao {

	public String getDataFromDB() {
		System.out.println("SampleDao start :::");
		String data = "SampleData";
		System.out.println("SampleDao ends :::");
		return data;
	}
}
