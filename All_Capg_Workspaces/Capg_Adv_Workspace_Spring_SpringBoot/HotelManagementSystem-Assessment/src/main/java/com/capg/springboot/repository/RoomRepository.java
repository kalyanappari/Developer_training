package com.capg.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.springboot.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer>{

}
