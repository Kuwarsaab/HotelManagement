package com.oyo.HotelManagement.service;

import com.oyo.HotelManagement.entity.Hotel;
import com.oyo.HotelManagement.entity.PriceInventoryDetails;
import com.oyo.HotelManagement.repo.PriceInventoryRepository;
import com.oyo.HotelManagement.dto.response.PriceInventoryResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class PriceInventoryService {

    @Autowired
    private PriceInventoryRepository priceInventoryRepository;

    public List<PriceInventoryResponseDto> getAvailableHotelsByMinPrice(List<Hotel> hotelList, LocalDate date){
        return null;
    }

    public List<PriceInventoryResponseDto> getPriceAndInventoryForHotel(Integer hotelId, LocalDate checkin){
        List<PriceInventoryResponseDto> priceInventoryResponseDtoList = new ArrayList<>();
        List<PriceInventoryDetails> priceInventoryDetails = priceInventoryRepository.findByHotelIdAndCheckin(hotelId,checkin);
        for(PriceInventoryDetails priceInventoryDetail : priceInventoryDetails){
            PriceInventoryResponseDto responseDto = convertPriceInventoryDetailsToPriceInventoryResponseDto(priceInventoryDetail);
            priceInventoryResponseDtoList.add(responseDto);
        }
        return priceInventoryResponseDtoList;
    }

    private PriceInventoryResponseDto convertPriceInventoryDetailsToPriceInventoryResponseDto(PriceInventoryDetails priceInventoryDetail) {
        Boolean isSoldOut = isHotelSoldOut(priceInventoryDetail.getAvailableRooms());
        return PriceInventoryResponseDto.builder().price(priceInventoryDetail.getPrice()).isSoldOut(isSoldOut).date(priceInventoryDetail.getDate()).build();
    }

    private Boolean isHotelSoldOut(Integer availableRooms) {
        return availableRooms<0;
    }
}
