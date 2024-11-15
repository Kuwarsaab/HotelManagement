package com.oyo.HotelManagement.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.oyo.HotelManagement.entity.Room;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
//@Builder
public class HotelResponseDto {
    private String errorMessage;
    private String hotelName;
    private String address;
    private String contactNumber;
    List<Room> rooms;
}
