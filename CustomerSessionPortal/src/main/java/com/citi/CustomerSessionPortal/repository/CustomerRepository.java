package com.citi.CustomerSessionPortal.repository;

import com.citi.CustomerSessionPortal.dto.CreateCustomerResponseDto;
import com.citi.CustomerSessionPortal.dto.CreateRequestDto;
import com.citi.CustomerSessionPortal.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    }
