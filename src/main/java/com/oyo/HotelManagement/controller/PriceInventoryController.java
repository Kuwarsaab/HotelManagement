package com.oyo.HotelManagement.controller;

import com.oyo.HotelManagement.dto.response.PriceInventoryResponseDto;
import com.oyo.HotelManagement.service.PriceInventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class PriceInventoryController {

    @Autowired
    private PriceInventoryService priceInventoryService;

    public List<PriceInventoryResponseDto> getPriceAndInventoryForHotel(@RequestParam("hotel_id") Integer hotelId, @RequestParam("checkin")LocalDate checkin){
        return priceInventoryService.getPriceAndInventoryForHotel(hotelId, checkin);
    }
}
