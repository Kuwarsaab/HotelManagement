package com.oyo.HotelManagement.repo;

import com.oyo.HotelManagement.entity.PriceInventoryDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PriceInventoryRepository extends JpaRepository<PriceInventoryDetails,Integer> {

    List<PriceInventoryDetails> findByHotelIdAndCheckin(Integer hotelId, LocalDate date);
}
