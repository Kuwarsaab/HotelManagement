package com.oyo.HotelManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oyo.HotelManagement.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bookings")
@Entity
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="booking_status")
    BookingStatus bookingStatus;

    @Column(name="hotel_id")
    Integer hotelId;

    @Column(name="room_id")
    Integer roomId;

    @Column(name="booking_amount")
    Integer bookingAmount;

    @Column(name = "is_prepaid")
    Boolean isPrepaid;

    @Column(name = "checkin")
    LocalDate checkin;

    @Column(name = "checkout")
    LocalDate checkout;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    Customer customer;


}
