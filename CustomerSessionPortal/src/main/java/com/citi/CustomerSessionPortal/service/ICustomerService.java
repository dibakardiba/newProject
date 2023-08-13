package com.citi.CustomerSessionPortal.service;

import com.citi.CustomerSessionPortal.dto.CreateCustomerRequestDto;
import com.citi.CustomerSessionPortal.dto.CreateCustomerResponseDto;
import com.citi.CustomerSessionPortal.dto.CreateRequestDto;

public interface ICustomerService {
    CreateCustomerResponseDto createCustomer(CreateCustomerRequestDto customerDTO);


}
