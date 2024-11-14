package com.oyo.HotelManagement.controller;

import com.oyo.HotelManagement.dto.request.HotelRequestDto;
import com.oyo.HotelManagement.dto.response.HotelResponseDto;
import com.oyo.HotelManagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/hotel")
@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping("/create")
    public Boolean createHotel(@RequestBody HotelRequestDto hotelRequestDto){
        Boolean success = hotelService.createHotel(hotelRequestDto);
        return success;
    }

    @GetMapping("/get")
    public HotelResponseDto getAllHotels(@RequestParam Integer hotelId){
        return hotelService.getHotelDetails(hotelId);
    }

}
