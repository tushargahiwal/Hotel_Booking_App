package com.example.demo.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import jakarta.persistence.Column;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {
	
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	// Long is used for to accessing highest capacity and we used collections and generics
	
	
//	@Column(name="check_In")
	private LocalDate checkedInDate;
	
//	@Column(name="check_Out")
	private LocalDate checkedOutDate;
	
//	@Column(name="Guest_FullName")
	private String guestFullName;
	
//	@Column(name="Guest_Email")
	private String guestEmail;
//	
//	@Column(name="adults")
	private int NumOfAdults;
	
//	@Column(name="children")
	private int NumOfChildren;
	
//	@Column(name="total_guest")
	private int totalNumOfGuest;
	
//	@Column(name="confirmation_Code")
	private String bookingConfirmationCode;
	
	private RoomResponse room;

	public BookingResponse(Long bookingId, LocalDate checkedInDate, LocalDate checkedOutDate,
			String bookingConfirmationCode) {
		super();
		this.bookingId = bookingId;
		this.checkedInDate = checkedInDate;
		this.checkedOutDate = checkedOutDate;
		this.bookingConfirmationCode = bookingConfirmationCode;
	}
	
	
	
	
	

}
