package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entity.Booking;
public interface BookingService {
	
	public Booking createBooking(Booking booking);
	
	public List<Booking> getAllBooking();
	
	public Booking getBookingById(int id);
	
	public Booking updateBooking(int id,Booking booking);
	
	public void cancelBooking(int id);
}
