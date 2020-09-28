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

@Path("/reservation")
@Produces(MediaType.APPLICATION_JSON)
public class ResesrvationResource {
	
	ReservationService reservationService=new ReservationService(); 
	@GET
	@Path("{customerId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Reservation> getReservation(@PathParam("customerId") long id ){
	return reservationService.getReservationsByCustomerId(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public List <Reservation> addReservation (Reservation reservation){
	 
			return reservationService.addReservation(reservation);
	}
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public List<Reservation> upDateReservation(Reservation updDatedReservation){
	
	return reservationService.upDateReservation(updDatedReservation);
	}
	
	

}
