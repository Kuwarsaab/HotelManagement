package com.oyo.HotelManagement.entity;

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
@Table(name="hotels")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="hotel_name", nullable = false)
    String name;

    @Column(name="address")
    String address;

    @Column(name="contact_number")
    String contactNumber;

    @Column(name="status")
    Boolean status;

    @JoinTable(
            name = "hotel_room_mappings",
            joinColumns = @JoinColumn(name = "hotel_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id")
    )
    @ManyToMany
    List<Room> roomList = new ArrayList<>();
}
