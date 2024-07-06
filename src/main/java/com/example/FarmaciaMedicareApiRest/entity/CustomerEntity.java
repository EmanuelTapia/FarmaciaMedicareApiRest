package com.example.FarmaciaMedicareApiRest.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCustomer;
    private String name;
    private String lastName;
    private String dni;
    private String birthdate;
    private String phoneNumber;
    private String address;
}
