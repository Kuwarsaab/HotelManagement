package com.oyo.HotelManagement.dto.response;

import com.oyo.HotelManagement.entity.AdharDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerResponseDto {
    private String name;
    private String phoneNumber;
    private String email;
    private AdharDetails adharDetails;

}
