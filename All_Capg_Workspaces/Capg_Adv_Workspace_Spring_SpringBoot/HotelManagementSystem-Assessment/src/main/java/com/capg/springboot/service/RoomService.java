package com.capg.springboot.service;

import java.util.List;

import com.capg.springboot.entity.Room;

public interface RoomService {
	
	public Room addRoom(Room room);
	
	public List<Room> getAllRooms();
	
	public Room getRoomByID(int id);
	
	public Room updateRoom(int id,Room room);
	
	public void deleteRoom(int id);
}
