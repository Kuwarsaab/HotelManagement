package com.oyo.HotelManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.oyo.HotelManagement.enums.RoomType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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

    @ManyToMany(mappedBy = "roomList")
    @JsonIgnore
    List<Hotel> hotelList = new ArrayList<>();


}
