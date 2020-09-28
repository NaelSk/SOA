package com.demo3.Accommodation;

import java.util.List;
import java.util.Map;

public class ReservationService {
	private static Map<Long, List<Reservation>> reservations = (Map<Long,List<Reservation> >) DBclass.getReservations();
	static Long reservationCounter=DBclass.getReservationC();
	
	public ReservationService() {
		ReservationService.reservationCounter=(long) 0;// This could guarantee that each customer has uniqe id
	}
	
	public static List <Reservation> addReservation(Reservation newReservation) {
		   newReservation.setReservation_id(reservationCounter);
		   if (reservations.get(newReservation.getCustomer_id()) == null) {
		   reservationCounter=reservationCounter+1;
		   reservations.put(newReservation.getCustomer_id(), (List <Reservation>)newReservation);
		   }else {
			   
			   Long customer_id=newReservation.getCustomer_id();
			   List<Reservation> downDateReservation=reservations.get(customer_id);
			   reservations.put(customer_id,downDateReservation);////????? I still need add the new reservation
		   }
			   
		return reservations.get(newReservation.getCustomer_id());
	}
	
	public List <Reservation> getReservationsByCustomerId(long customer_id) {
		 List <Reservation> customer_reservations=reservations.get(customer_id);
		 return customer_reservations;
		   
	   }
	
	public Reservation getReservationById(Long reservation_id, Long customer_id) {
		List <Reservation> customer_reservations=reservations.get(customer_id);
		
		for (int i = 0; i < customer_reservations.size(); i++) {
			Reservation reserv=customer_reservations.get(i);
			Long reserv_id=reserv.getReservation_id();
			if (reserv_id==reservation_id) {return reserv;}
        }
		
		return null;
	}	
	
	public List<Reservation> upDateReservation(Reservation modifyreservation){
		Long customer_id=modifyreservation.getCustomer_id();
		List <Reservation> reservationsList=reservations.get(customer_id);
		Long reservation_id=modifyreservation.getReservation_id();
		
		for (int i = 0; i < reservationsList.size(); i++) {
			if (reservation_id==(reservationsList.get(i).getReservation_id())){
				reservationsList.set(i, modifyreservation);	
			}
			
		}
	    reservations.put(customer_id,reservationsList);
		
	return reservations.get(customer_id);
	}

}
