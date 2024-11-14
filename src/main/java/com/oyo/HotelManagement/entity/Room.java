package com.oyo.HotelManagement.entity;

import com.oyo.HotelManagement.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name="room_type")
    RoomType roomType;

    @Column(name="amenities")
    String amenities;

    @Column(name="max_occupancy")
    Integer maxOccupancy;

    @Column(name="active")
    Boolean active;


}
