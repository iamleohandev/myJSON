package com.leo.han.beans;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Employee {
	 
    private int id;
    private String name;
    private boolean permanent;
    private Address[] address;
    private long[] phoneNumbers;
    private String role;
    private List<String> cities;
    private Map<String, String> properties;
    private Date startDate;
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isPermanent() {
        return permanent;
    }
    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }
    public Address[] getAddress() {
        return address;
    }
    public void setAddress(Address[] address) {
        this.address = address;
    }
    public long[] getPhoneNumbers() {
        return phoneNumbers;
    }
    public void setPhoneNumbers(long[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
     
    
    public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("***** Employee Details *****\n");
        sb.append("ID="+getId()+"\n");
        sb.append("Name="+getName()+"\n");
        sb.append("Permanent="+isPermanent()+"\n");
        sb.append("Role="+getRole()+"\n");
        sb.append("Phone Numbers="+Arrays.toString(getPhoneNumbers())+"\n");
        sb.append("Address="+ Arrays.toString(getAddress())+"\n");
        sb.append("Cities="+Arrays.toString(getCities().toArray())+"\n");
        sb.append("Properties="+getProperties()+"\n");
        sb.append("*****************************");
         
        return sb.toString();
    }
    public List<String> getCities() {
        return cities;
    }
    public void setCities(List<String> cities) {
        this.cities = cities;
    }
    public Map<String, String> getProperties() {
        return properties;
    }
    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
