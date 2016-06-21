package com.test;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class JsonConvert {
	
	public static void main(String[] args) {

		// For testing
		Employee emp = new Employee();
		emp.setId(1);
		emp.setAge(25);
		emp.setName("Gayaz");
		emp.setGender("Male");
		emp.setRole("Developer");
		emp.setPassword("sensitive");
        List<Employee> listemp = new ArrayList<Employee>();
        listemp.add(emp);
        listemp.add(emp);
        listemp.add(emp);
        listemp.add(emp);
		Gson gson = new Gson();
		String json = gson.toJson(listemp);
		System.out.println(json);

	}
	
	
	
	public static String convertToJson(Object obj){
		Gson gson = new Gson();
		String json = gson.toJson(obj);
		return json;
	}
}