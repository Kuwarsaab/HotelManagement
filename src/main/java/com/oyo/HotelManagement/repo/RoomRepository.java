package com.oyo.HotelManagement.repo;

import com.oyo.HotelManagement.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


public interface RoomRepository extends JpaRepository<Room, Integer> {
}
