package com.example.demo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Room {

	 private Long id;
	 
	 private String roomType;
	 
	 private BigDecimal roomPrice;
	 
	 private boolean isBooked=false;
	 
	 private List<BookedRoom> bookings;
	 
	 public Room()
	 {
		 this.bookings=new ArrayList<>();
		 // when new room added to the database at that initial stage room is not booked
		 // to avoid null pointer exception we add empty arraylist
	 }
}
