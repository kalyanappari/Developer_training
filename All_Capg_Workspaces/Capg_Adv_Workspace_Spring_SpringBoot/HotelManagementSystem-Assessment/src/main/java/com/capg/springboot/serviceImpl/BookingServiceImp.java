package com.capg.springboot.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.entity.Room;
import com.capg.springboot.repository.BookingRepository;
import com.capg.springboot.repository.RoomRepository;
import com.capg.springboot.service.BookingService;

@Service
public class BookingServiceImp implements BookingService{

	private BookingRepository brepo;
	
	private RoomRepository repo;
	
	public BookingServiceImp(BookingRepository brepo,RoomRepository repo) {
		this.brepo = brepo;
		this.repo = repo;
	}
	
	@Override
	public Booking createBooking(Booking booking) {
		
		Room room = repo.findById(booking.getRoom_id().getRoomId()).get();
		room.getBookings().add(booking);
		room.setStatus("Booked!!");
		return brepo.save(booking);
	}

	@Override
	public List<Booking> getAllBooking() {
		
		List<Booking> bookings = new ArrayList<>();
		
		brepo.findAll().forEach(obj -> bookings.add(obj));
		
		return  bookings;
	}

	@Override
	public Booking getBookingById(int id) {
		
		Booking booking = brepo.findById(id).get();
		
		return booking;
	}

	@Override
	public Booking updateBooking(int id, Booking booking) {
		
		Booking booking1 = brepo.findById(id).get();
		
		if(booking == null) {
			return null;
		}
		
		booking1.setCustomerName(booking.getCustomerName());
		booking1.setCustomerPhone(booking.getCustomerPhone());
		booking1.setCheckInDate(booking.getCheckInDate());
		
		Room room = booking.getRoom_id();
		
		room.getBookings().add(booking1);
		booking1.setRoom_id(booking.getRoom_id());
		
		return booking1;
	}

	@Override
	public void cancelBooking(int id) {
		
		Booking bdel = getBookingById(id);
		
		brepo.delete(bdel);
	}
	
}
