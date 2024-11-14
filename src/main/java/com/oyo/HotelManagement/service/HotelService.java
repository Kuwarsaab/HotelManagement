package com.oyo.HotelManagement.service;

import com.oyo.HotelManagement.dto.request.HotelRequestDto;
import com.oyo.HotelManagement.dto.response.HotelResponseDto;
import com.oyo.HotelManagement.entity.Hotel;
import com.oyo.HotelManagement.repo.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public Boolean createHotel(HotelRequestDto hotelRequestDto){
        Hotel hotel = convertHotelRequestDtoToHotel(hotelRequestDto);
        hotelRepository.save(hotel);
        return true;
    }

    private Hotel convertHotelRequestDtoToHotel(HotelRequestDto hotelRequestDto) {
        Hotel hotel = new Hotel();
        hotel.setName(hotelRequestDto.getHotelName());
        hotel.setAddress(hotelRequestDto.getAddress());
        hotel.setContactNumber(hotelRequestDto.getContactNumber());
        hotel.setStatus(hotelRequestDto.getStatus());
        return hotel;
    }

    public HotelResponseDto getHotelDetails(Integer hotelId){
        Optional<Hotel> hotel = hotelRepository.findById(hotelId);
        return covertHoteltoHotelResponseDto(hotel.get());
    }

    private HotelResponseDto covertHoteltoHotelResponseDto(Hotel hotel) {
        HotelResponseDto hotelResponseDto = new HotelResponseDto();
        hotelResponseDto.setHotelName(hotel.getName());
        hotelResponseDto.setAddress(hotel.getAddress());
        hotelResponseDto.setContactNumber(hotel.getContactNumber());
        return hotelResponseDto;
    }
}
