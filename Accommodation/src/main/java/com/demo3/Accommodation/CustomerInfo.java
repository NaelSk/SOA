package com.demo3.Accommodation;

import java.util.List;

public class CustomerInfo {
	Customer customer;
	List <Reservation> ReservationList;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Reservation> getReservationList() {
		return ReservationList;
	}
	public void setReservationList(List<Reservation> reservationList) {
		ReservationList = reservationList;
	}
	
	

}
