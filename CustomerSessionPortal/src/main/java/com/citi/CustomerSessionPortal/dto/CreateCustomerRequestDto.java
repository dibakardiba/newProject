package com.citi.CustomerSessionPortal.dto;

import lombok.Data;

@Data
public class CreateCustomerRequestDto {
    private String customerName;
    private Long customerId;

}
