package com.example.FarmaciaMedicareApiRest.service.impl;

import com.example.FarmaciaMedicareApiRest.entity.CustomerEntity;
import com.example.FarmaciaMedicareApiRest.repository.CustomerRepository;
import com.example.FarmaciaMedicareApiRest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<CustomerEntity> getCustomer() {
        return this.customerRepository.findAll();
    }

    @Override
    public Optional<CustomerEntity> getCustomerById(Long id) {
        return this.customerRepository.findById(id);
    }

    @Override
    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public CustomerEntity updateCustomerById(CustomerEntity customer, Long id) {
        CustomerEntity customerEntity=customerRepository.findById(id).get();

        customerEntity.setName(customer.getName());
        customerEntity.setLastName(customer.getLastName());
        customerEntity.setDni(customer.getDni());
        customerEntity.setBirthdate(customer.getBirthdate());
        customerEntity.setPhoneNumber(customer.getPhoneNumber());
        customerEntity.setAddress(customer.getAddress());

        customerRepository.save(customerEntity);
        return customerEntity;
    }

    @Override
    public void deleteCustomerById(Long id) {
        this.customerRepository.deleteById(id);
    }
}
