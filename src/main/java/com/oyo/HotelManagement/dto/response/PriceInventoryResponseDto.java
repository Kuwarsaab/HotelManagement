package com.oyo.HotelManagement.dto.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class PriceInventoryResponseDto {
    Integer hotelId;
    Integer roomId;
    Boolean isSoldOut;
    Integer price;
    LocalDate date;
}
