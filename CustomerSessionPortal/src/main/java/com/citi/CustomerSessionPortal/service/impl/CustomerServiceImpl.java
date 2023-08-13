package com.citi.CustomerSessionPortal.service.impl;

import com.citi.CustomerSessionPortal.dto.CreateCustomerRequestDto;
import com.citi.CustomerSessionPortal.dto.CreateCustomerResponseDto;
import com.citi.CustomerSessionPortal.dto.CreateRequestDto;
import com.citi.CustomerSessionPortal.entity.Customer;
import com.citi.CustomerSessionPortal.entity.Session;
import com.citi.CustomerSessionPortal.repository.CustomerRepository;
import com.citi.CustomerSessionPortal.service.ICustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
   public  CreateCustomerResponseDto createCustomer(CreateCustomerRequestDto customerDTO){
        Customer customer = modelMapper.map(customerDTO, Customer.class);
        customer = customerRepository.save(customer);
        return modelMapper.map(customer, CreateCustomerResponseDto.class);
//        Customer customer = mapper.convertRequestToEntity(request);
//        Session savedSession = sessionRepository.save(session);
//        return mapper.convertEntityToResponseDto(savedSession);

    }

}
