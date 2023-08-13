package com.citi.CustomerSessionPortal.service;

import com.citi.CustomerSessionPortal.dto.CreateRequestDto;
import com.citi.CustomerSessionPortal.dto.CreateResponseDto;
import org.springframework.stereotype.Service;

@Service
public interface SessionService {
    public CreateResponseDto createSession(CreateRequestDto request);

}
