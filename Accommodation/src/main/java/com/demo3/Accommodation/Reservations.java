package com.demo3.Accommodation;

public class Reservations {
	
	private Long reservation_id;
	private Long customer_id;
	
	
	public void Reservation(Long reservCustomer_id) {
		this.customer_id=reservCustomer_id;
		
	}


	public Long getReservation_id() {
		return reservation_id;
	}


	public void setReservation_id(Long reservation_id) {
		this.reservation_id = reservation_id;
	}


	public Long getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}
	

}
