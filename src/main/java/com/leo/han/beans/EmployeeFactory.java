package com.leo.han.beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeFactory {

	public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("David");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address a1 = new Address();
		a1.setCity("Bangalore");
		a1.setStreet("BTM 1st Stage");
		a1.setZipcode(560100);

		Address a2 = new Address();
		a2.setCity("Beijing");
		a2.setStreet("32 Nebula Starway");
		a2.setZipcode(11234);

		Address[] add = { a1, a2 };

		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}

}
