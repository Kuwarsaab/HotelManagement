package com.oyo.HotelManagement.dto.response;

import com.oyo.HotelManagement.entity.Room;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class HotelResponseDto {

    private String hotelName;
    private String address;
    private String contactNumber;
    List<Room> rooms;
}
