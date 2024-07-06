package com.example.FarmaciaMedicareApiRest.controller;

import com.example.FarmaciaMedicareApiRest.entity.CustomerEntity;
import com.example.FarmaciaMedicareApiRest.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerEntity> getCustomer(){
        return this.customerService.getCustomer();
    }

    @GetMapping(path = "/{idCustomer}")
    public Optional<CustomerEntity> getCustomerById(@PathVariable("idCustomer") Long id){
        return this.customerService.getCustomerById(id);
    }

    @PostMapping
    public CustomerEntity saveCustomer(@RequestBody CustomerEntity customer){
        return this.customerService.saveCustomer(customer);
    }

    @PutMapping(path = "/{idCustomer}")
    public CustomerEntity updateCustomerById(@RequestBody CustomerEntity customer, @PathVariable("idCustomer") Long id){
        return this.customerService.updateCustomerById(customer,id);
    }

    @DeleteMapping(path = "/{idCustomer}")
    public void deleteCustomerById(@PathVariable("idCustomer") Long id){
        this.customerService.deleteCustomerById(id);
    }
}
