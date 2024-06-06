package com.crispus.trocme.models;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {
    private String firstname;
    private String lastname;
    private String mail;
    private String country;
    private String region;
    private String city;
    private String nameStreet;
    private Integer zipcode;
    private String password;
}
