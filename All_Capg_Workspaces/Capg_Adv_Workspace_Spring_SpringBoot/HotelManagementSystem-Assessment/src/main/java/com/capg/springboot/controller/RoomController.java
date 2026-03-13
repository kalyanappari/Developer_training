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

import com.capg.springboot.entity.Room;
import com.capg.springboot.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {
	
	@Autowired
	private RoomService service;
	
	@PostMapping("/addroom")
	public Room addBook(@RequestBody Room room) {
		return service.addRoom(room);
	}
	
	@GetMapping("/getAllRooms")
	public List<Room> getAllRooms(){
		return service.getAllRooms();
	}
	
	@GetMapping("/getroom/{id}")
	public Room getRoomByID(@PathVariable int id) {
		return service.getRoomByID(id);
	}
	
	@PutMapping("/updateroom/{id}")
	public Room updateRoom(@PathVariable int id,@RequestBody Room room) {
		return service.updateRoom(id, room);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRoom(@PathVariable int id) {
		service.deleteRoom(id);
		return "Room Successfully Deleted!";
	}
}
