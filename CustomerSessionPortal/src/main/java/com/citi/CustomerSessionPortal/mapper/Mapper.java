package com.citi.CustomerSessionPortal.mapper;

import com.citi.CustomerSessionPortal.dto.CreateRequestDto;
import com.citi.CustomerSessionPortal.dto.CreateResponseDto;
import com.citi.CustomerSessionPortal.entity.Session;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mapper {
    @Autowired
    org.modelmapper.ModelMapper modelMapper;

    public CreateRequestDto convertEntityToRequestDto(Session session) {
        return modelMapper.map(session, CreateRequestDto.class);
    }

    public CreateResponseDto convertEntityToResponseDto(Session session) {

        return modelMapper.map(session, CreateResponseDto.class);

    }

    public Session convertRequestToEntity(CreateRequestDto sessionRequest) {

        return modelMapper.map(sessionRequest, Session.class);

    }

}
