package com.capg.springboot.entity;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Booking {
	
	@Id
	private int bookingId;
	
	private String customerName;
	
	private long customerPhone;
	
	private LocalDate checkInDate;
	
	private LocalDate checkOutDate;
	
	@ManyToOne
	@JoinColumn(name = "roomid")
	@JsonBackReference
	private Room roomid;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(long customerPhone) {
		this.customerPhone = customerPhone;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public Room getRoom_id() {
		return roomid;
	}

	public void setRoom_id(Room room_id) {
		this.roomid = room_id;
	}
}
