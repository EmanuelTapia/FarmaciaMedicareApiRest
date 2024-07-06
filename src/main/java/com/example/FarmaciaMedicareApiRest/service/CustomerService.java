package com.example.FarmaciaMedicareApiRest.service;

import com.example.FarmaciaMedicareApiRest.entity.CustomerEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<CustomerEntity> getCustomer();
    Optional<CustomerEntity> getCustomerById(Long id);
    CustomerEntity saveCustomer(CustomerEntity customer);
    CustomerEntity updateCustomerById(CustomerEntity customer, Long id);
    void deleteCustomerById(Long id);
}
