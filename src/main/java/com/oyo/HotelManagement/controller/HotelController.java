package com.oyo.HotelManagement.controller;

import com.oyo.HotelManagement.Exception.HotelNotFoundException;
import com.oyo.HotelManagement.dto.request.HotelRequestDto;
import com.oyo.HotelManagement.dto.response.HotelResponseDto;
import com.oyo.HotelManagement.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/v1/hotel")
@RestController
public class HotelController {
    @Autowired
    private HotelService hotelService;

    @PostMapping("/create")
    public ResponseEntity<Boolean> createHotel(@RequestBody HotelRequestDto hotelRequestDto){
        Boolean success = hotelService.createHotel(hotelRequestDto);
        return new ResponseEntity<>(success, HttpStatus.CREATED);
    }

    @GetMapping("/get")
    public ResponseEntity<HotelResponseDto> getAllHotels(@RequestParam Integer hotelId){
        HotelResponseDto hotelResponseDto = new HotelResponseDto();
        try {
            hotelResponseDto = hotelService.getHotelDetails(hotelId);
            return new ResponseEntity<>(hotelResponseDto,HttpStatus.OK);
        } catch (HotelNotFoundException e) {
            hotelResponseDto = new HotelResponseDto();
            hotelResponseDto.setErrorMessage(e.getMessage());
            return new ResponseEntity<>(hotelResponseDto,HttpStatus.BAD_REQUEST);
        }
    }

}
