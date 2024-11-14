package com.oyo.HotelManagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="adhar_details")
@Entity
public class AdharDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name="url")
    String url;

    @Column(name="dob")
    String dob;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    @JsonIgnore
    Customer customer;

}
