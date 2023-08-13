package com.citi.CustomerSessionPortal.service.impl;

import com.citi.CustomerSessionPortal.dto.CreateRequestDto;
import com.citi.CustomerSessionPortal.dto.CreateResponseDto;
import com.citi.CustomerSessionPortal.entity.Session;
import com.citi.CustomerSessionPortal.mapper.Mapper;
import com.citi.CustomerSessionPortal.repository.SessionRepository;
import com.citi.CustomerSessionPortal.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl implements SessionService {
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    Mapper mapper;
    @Override
    public CreateResponseDto createSession(CreateRequestDto request) {

        Session session = mapper.convertRequestToEntity(request);
        Session savedSession = sessionRepository.save(session);
        return mapper.convertEntityToResponseDto(savedSession);

    }

}
