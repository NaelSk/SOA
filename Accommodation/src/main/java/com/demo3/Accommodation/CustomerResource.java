package com.demo3.Accommodation;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerResource {
	CustomerService customerService = new CustomerService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getPublications(){
	return customerService.getAllCustomers();
	}
	
	
	@GET
	@Path("{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@PathParam("customerId") long id){
	Customer required_customer = customerService.getCustomerById(id);
	return required_customer;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer addCustomer (Customer customer){
	return CustomerService.addCustomer(customer);
	}
	
	@PUT
	@Path("{customerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Customer updateCustomer(@PathParam("customerId") long id, Customer upDatedCustomer){
	upDatedCustomer.setCustomer_id(id);
	return customerService.upDateCutomer(upDatedCustomer);
	}
	
	
}
