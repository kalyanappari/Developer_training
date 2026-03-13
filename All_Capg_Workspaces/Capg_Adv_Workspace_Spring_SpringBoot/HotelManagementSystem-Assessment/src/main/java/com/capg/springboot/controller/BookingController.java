package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.entity.Booking;
import com.capg.springboot.service.BookingService;

@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	private BookingService service;
	
	@PostMapping("/addBooking")
	public Booking addBooking(@RequestBody Booking booking) {
		return service.createBooking(booking);
	}
	
	@GetMapping("/getallbookings")
	public List<Booking> getAllBooking(){
		return service.getAllBooking();
	}
	
	@GetMapping("/getbookingbyid/{id}")
	public Booking getBookingByID(@PathVariable int id) {
		return service.getBookingById(id);
	}
	
	@PutMapping("/updateBooking/{id}")
	public Booking updateBooking(@PathVariable int id,@RequestBody Booking booking) {
		return service.updateBooking(id, booking);
	}
	
	@DeleteMapping("/cancelbooking/{id}")
	public String cancelBooking(@PathVariable int id) {
		service.cancelBooking(id);
		return "Booking Cancelled Successfully!";
	}
}
