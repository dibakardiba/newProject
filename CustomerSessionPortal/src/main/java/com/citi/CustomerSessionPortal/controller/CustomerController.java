package com.citi.CustomerSessionPortal.controller;

import com.citi.CustomerSessionPortal.dto.CreateCustomerRequestDto;
import com.citi.CustomerSessionPortal.dto.CreateCustomerResponseDto;
import com.citi.CustomerSessionPortal.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired
    private ICustomerService customerService;

    @PostMapping
    public ResponseEntity<CreateCustomerResponseDto> createCustomer(@RequestBody CreateCustomerRequestDto customerDTO) {

        CreateCustomerResponseDto createdCustomer = customerService.createCustomer(customerDTO);
        return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
    }

}
