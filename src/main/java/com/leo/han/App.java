package com.leo.han;

import java.io.IOException;

import com.leo.han.beans.Employee;
import com.leo.han.beans.EmployeeFactory;
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
        String s = eHelper.ObjectToJSON(EmployeeFactory.createEmployee());
        
        System.out.println(s);
        
        
        Employee employee = eHelper.JSONToObject(s, Employee.class);
        
        
        System.out.println(employee);
        
        
    }
    
   
}
