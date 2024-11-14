package com.oyo.HotelManagement.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HotelRequestDto {
    private String hotelName;
    private String address;
    private String contactNumber;
    private Boolean status;

}
