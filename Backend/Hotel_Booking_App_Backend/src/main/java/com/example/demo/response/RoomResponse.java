package com.example.demo.response;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.List;

import org.apache.tomcat.util.codec.binary.Base64;

//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.Lob;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class RoomResponse {

//	 @Id
//	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
//	 @Column
	 private String roomType;
	 
//	 @Column
	 private BigDecimal roomPrice;
	 
//	 @Column
	 private boolean isBooked=false;
	 
//	 @Column
//	 @Lob
	 private String photo;
	 
	 private List<BookingResponse> bookings;

	public RoomResponse(Long id, String roomType, BigDecimal roomPrice) 
	{
		super();
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
	}

	public RoomResponse(Long id, String roomType, BigDecimal roomPrice, boolean isBooked, byte[] photoBytes,
			List<BookingResponse> bookings) {
		super();
		this.id = id;
		this.roomType = roomType;
		this.roomPrice = roomPrice;
		this.isBooked = isBooked;
		this.photo = photoBytes != null ? Base64.encodeBase64String(photoBytes): null;
		this.bookings = bookings;
	}
	
	
	 
	 
	 
	 
}
