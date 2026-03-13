package com.capg.springboot.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.capg.springboot.entity.Room;
import com.capg.springboot.repository.RoomRepository;
import com.capg.springboot.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService{
	
	private RoomRepository roomrepo;
	
	public RoomServiceImpl(RoomRepository rrepo) {
		this.roomrepo = rrepo;
	}

	@Override
	public Room addRoom(Room room) {
		return roomrepo.save(room);
	}

	@Override
	public List<Room> getAllRooms() {
		
		List<Room> rooms = new ArrayList<>();
		
		roomrepo.findAll().forEach(obj -> rooms.add(obj));
		
		return rooms;
	}

	@Override
	public Room getRoomByID(int id) {
		return roomrepo.findById(id).get();
	}

	@Override
	public Room updateRoom(int id, Room room) {
		
		Room room1 = getRoomByID(id);
		
		room1.setRoomNumber(room.getRoomNumber());
		room1.setRoomType(room.getRoomType());
		room1.setPrice(room.getPrice());
		room1.setStatus(room.getStatus());
		
		return room1;
	}

	@Override
	public void deleteRoom(int id) {
		
		Room room = getRoomByID(id);
		
		if(room != null) {
			roomrepo.delete(room);
		}
	}

}
