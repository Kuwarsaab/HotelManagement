package com.oyo.HotelManagement.dto.request;

import com.oyo.HotelManagement.entity.AdharDetails;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerRequestDto {
    private String name;
    private String phoneNumber;
    private String email;
    private AdharDetails adharDetails;
}
