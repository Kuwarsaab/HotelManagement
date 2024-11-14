package com.oyo.HotelManagement.repo;

import com.oyo.HotelManagement.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {

    Optional<Hotel> findById(Integer id);
}
