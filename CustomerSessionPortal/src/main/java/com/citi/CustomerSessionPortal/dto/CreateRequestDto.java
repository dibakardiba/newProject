package com.citi.CustomerSessionPortal.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class CreateRequestDto {
    private String sessionName;
    private String remarks;
    private String createdBy;
    private String status;
    private LocalDateTime createdOn;
    private String customerName;

}
