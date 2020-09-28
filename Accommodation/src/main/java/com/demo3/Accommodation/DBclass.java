package com.demo3.Accommodation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBclass {

	private static Map<Long, Customer> customers = new HashMap<Long, Customer>();
	private static Map<Long, List<Reservation>> reservations = new HashMap<Long, List <Reservation>>();
	
	private static Long customersC = (long) 0;
	private static Long reservationC=(long)0;
	
	
	public static Long getReservationC() {
		return reservationC;
	}


	public static void setReservationC(Long reservationC) {
		DBclass.reservationC = reservationC;
	}


	public static Map<Long, List<Reservation>> getReservations() {
		return reservations;
	}


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