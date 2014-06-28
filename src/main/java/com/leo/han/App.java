package com.leo.han;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.leo.han.jackson.Address;
import com.leo.han.jackson.Employee;
import com.leo.han.jackson.JacksonHelper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {    
        JacksonHelper<Employee> eHelper = new JacksonHelper<Employee>();
        String s = eHelper.ObjectToJSON(createEmployee());
        
        System.out.println(s);
        
        
        Employee employee = eHelper.JSONToObject(s, Employee.class);
        
        
        System.out.println(employee);
        
        
    }
    
    public static Employee createEmployee() {
    	 
        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("David");
        emp.setPermanent(false);
        emp.setPhoneNumbers(new long[] { 123456, 987654 });
        emp.setRole("Manager");
 
        
        
        
        Address a1 =new Address();
        a1.setCity("Bangalore");
        a1.setStreet("BTM 1st Stage");
        a1.setZipcode(560100);
        
        Address a2 =new Address();
        a2.setCity("Beijing");
        a2.setStreet("32 Nebula Starway");
        a2.setZipcode(11234);
        
        Address[] add = {a1,a2};
        
        
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
