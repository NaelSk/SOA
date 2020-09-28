package com.demo3.Accommodation;

public class Reservation {

	private Long reservation_id;
	private Long customer_id;
	private Long accommodation_id;

	public Reservation(Long reservCustomer_id, Long reservaccommodation) {
		this.customer_id = reservCustomer_id;
		this.accommodation_id=reservaccommodation; 
	}

	public Long getAccommodation_id() {
		return accommodation_id;
	}

	public void setAccommodation_id(Long accommodation_id) {
		this.accommodation_id = accommodation_id;
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
