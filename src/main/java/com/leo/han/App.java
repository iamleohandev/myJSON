package com.leo.han;

import com.leo.han.beans.Employee;
import com.leo.han.beans.EmployeeFactory;
import com.leo.han.jsonhelper.GsonHelper;
import com.leo.han.jsonhelper.JacksonHelper;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws Exception {

		System.out
				.println("--------------------Start the Jackson json parser----------------");
		JacksonHelper<Employee> eHelper = new JacksonHelper<Employee>();
		String jacksonS = eHelper
				.ObjectToJSON(EmployeeFactory.createEmployee());
		System.out.println(jacksonS);

		Employee jacksonE = eHelper.JSONToObject(jacksonS, Employee.class);
		System.out.println(jacksonE);

		System.out
				.println("--------------------Start the GSON json parser----------------");

		GsonHelper<Employee> gHelper = new GsonHelper<Employee>();
		String gsonS = gHelper.ObjectToJSON(EmployeeFactory.createEmployee());
		System.out.println(gsonS);
		
		Employee gsonE = gHelper.JSONToObject(gsonS, Employee.class);
		System.out.println(gsonE);
	}

}
