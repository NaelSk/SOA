package com.demo3.Accommodation;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("/customersInfo")
@Produces(MediaType.APPLICATION_JSON)
public class CustomerInfoResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers() {
		return CustomerService.getAllCustomers();
	}

	@GET
	@Path("/{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public CustomerInfo getCustomer(@PathParam("customerId") long id) {
		Customer customer_info = CustomerService.getCustomerById(id);
		List<Reservation> list = ReservationService.getReservationsByCustomerId(id);
		CustomerInfo required_customer = new CustomerInfo();
		required_customer.setCustomer(customer_info);
		required_customer.setReservationList(list);
		return required_customer;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerInfo addCustomer(Customer customer) {
		CustomerInfo added_customer = new CustomerInfo();
		Customer customerinfo = CustomerService.addCustomer(customer);
		added_customer.setCustomer(customerinfo);
		return added_customer;
	}

	@PUT
	@Path("/{customerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	/*
	 * Todo This put method should check if the id in path same as in the Jeson body
	 * and rejected if not.
	 */
	public CustomerInfo updateCustomer(@PathParam("customerId") long id, Customer outDatedCustomer) {
		CustomerInfo customer = new CustomerInfo();
		Customer upDatedCustomer = CustomerService.upDateCutomer(outDatedCustomer, id);
		customer.setCustomer(upDatedCustomer);
		List<Reservation> list = ReservationService.getReservationsByCustomerId(id);
		customer.setReservationList(list);
		return customer;
	}

	@DELETE
	@Path("/{customerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	/*
	 * Todo This put method should check if the id in path same as in the Jeson body
	 * and rejected if not.
	 */
	public Response removeCustomer(@PathParam("customerId") long id) {
		Customer deletedCustomer = CustomerService.deleteCustomer(id);
		return Response.status(Status.OK).entity("Customer deleted").build();
	}

	@POST
	@Path("/{customerId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerInfo addReservation(@PathParam("customerId") long id, Reservation newReservation) {
		CustomerInfo customerInfo = new CustomerInfo();
		Customer customer = CustomerService.getCustomerById(id);
		ReservationService.addReservation(newReservation, id);
		List<Reservation> list = ReservationService.getReservationsByCustomerId(id);
		customerInfo.setReservationList(list);
		customerInfo.setCustomer(customer);
		return customerInfo;
	}
	
	@PUT
	@Path("/reservation")
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerInfo upDateReservation(@QueryParam("ReservationId")long rId,@QueryParam("CustomerId")long cId,Reservation updDatedReservation){
	CustomerInfo customerInfo = new CustomerInfo();
	Customer customer = CustomerService.getCustomerById(cId);
	List <Reservation> list= ReservationService.upDateReservation(cId,rId,updDatedReservation);
	customerInfo.setReservationList(list);
	customerInfo.setCustomer(customer);
	return customerInfo; 
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/reservations")
	public CustomerInfo deleteAllReservations(@QueryParam("CustomerId")long cId){
	CustomerInfo customerInfo = new CustomerInfo();
	Customer customer = CustomerService.getCustomerById(cId);
	ReservationService.deleteAllreservations(cId);
    List <Reservation> list=ReservationService.getReservationsByCustomerId(cId);
	customerInfo.setReservationList(list);
	customerInfo.setCustomer(customer);
    return customerInfo;
	}
	
	
	@DELETE
	@Path("/customer")
	@Consumes(MediaType.APPLICATION_JSON)
	public CustomerInfo   cancelReservation(@QueryParam("customerId")long cId,@QueryParam("reservationId")long rId){
	List <Reservation> list =ReservationService.cancelReservation(cId,rId);
	CustomerInfo customerInfo = new CustomerInfo();
	Customer customer = CustomerService.getCustomerById(cId);
	customerInfo.setReservationList(list);
	customerInfo.setCustomer(customer);
    
	return customerInfo; 
	}
	
	

}