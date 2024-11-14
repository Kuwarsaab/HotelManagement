package com.oyo.HotelManagement.repo;

import com.oyo.HotelManagement.entity.AdharDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdharRepo extends JpaRepository<AdharDetails,Integer> {
}
