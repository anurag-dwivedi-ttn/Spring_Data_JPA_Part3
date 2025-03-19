package com.example.jpa3.embedded;

// Q1) Create Address class


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String streetNumber;
    private String location;
    private String state;
}

