package com.oyo.HotelManagement.service;

import com.oyo.HotelManagement.dto.request.BookingRequestDto;
import com.oyo.HotelManagement.dto.response.BookingResponseDto;
import org.springframework.stereotype.Component;


@Component
public class BookingService {

    public BookingResponseDto createBooking(BookingRequestDto bookingRequestDto){
        // Validate request
        // Inventory Availble or not? and get Inventory
        // Create with Status -> CREATED
        // Update Inventory
        return null;

    }

    public Boolean cancelBooking(Integer bookingId){
        return true;
    }

    public BookingResponseDto updateBooking(BookingRequestDto bookingRequestDto){
        return null;
    }

    public BookingResponseDto getBooking(Integer bookingId){
        return null;
    }
}
