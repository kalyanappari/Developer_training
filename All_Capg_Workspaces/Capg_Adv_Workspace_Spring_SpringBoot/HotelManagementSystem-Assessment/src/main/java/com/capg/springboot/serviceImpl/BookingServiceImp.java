package com.capg.springboot.serviceImpl;

import java.util.List;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.repository.BookingRepository;
import com.capg.springboot.service.BookingService;

public class BookingServiceImp implements BookingService{
	
	private BookingRepository brepo;
	
	public BookingServiceImp(BookingRepository brepo) {
		this.brepo = brepo;
	}
	
	@Override
	public Booking createBooking(Booking booking) {
		
		return brepo.save(booking);
	}

	@Override
	public List<Booking> getAllBooking() {
		
	}

	@Override
	public Booking getBookingById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking updateBooking(int id, Booking booking) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void cancelBooking(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
