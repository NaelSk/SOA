package com.demo3.Accommodation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerService {

	private static Map<Long, Customer> customers = (Map<Long, Customer>) DBclass.getCustomers();
	static Long customersCounter = DBclass.getCustomersC();
	
	public CustomerService() {
		CustomerService.customersCounter=(long) 0;// This could guarantee that each customer has uniqe id
	}

	public static Customer addCustomer(Customer newCustomer) {
		   newCustomer.setCustomer_id(customersCounter);
		   customersCounter=customersCounter+1;
		   customers.put(newCustomer.getCustomer_id(), newCustomer);
		return newCustomer;
	}
	
	
	public List<Customer> getAllCustomers() {
		return new ArrayList<Customer>(customers.values());
	}
	
   public Customer getCustomerById(long id) {
	   
	   Customer foundedCustomer=customers.get(id);
	   
	   
	return foundedCustomer;
	   
   }
   
   public Customer upDateCutomer(Customer modifyCustomer) {
	   
	   customers.put(modifyCustomer.getCustomer_id(), modifyCustomer);
	   return  modifyCustomer;
	   
	   
   }

}