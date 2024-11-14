package com.oyo.HotelManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customers")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="phone_number")
    String phoneNumber;

    @Column(name="email")
    String email;

    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    AdharDetails adharDetails;

    @OneToMany(mappedBy = "customer")
    List<Bookings> bookingsList = new ArrayList<>();
}
