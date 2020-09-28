package com.demo3.Accommodation;

import java.util.HashMap;
import java.util.Map;

public class DBclass {

	private static Map<Long, Customer> customers = new HashMap<Long, Customer>();
	private static Long customersC = (long) 0;
	
	
	public static Map<Long, Customer> getCustomers(){
		return customers;
		}


	public static Long getCustomersC() {
		return customersC;
	}
	
	public void setCustomersC(Long newCustomerC) {
		DBclass.customersC= newCustomerC;
		
	}


	


}