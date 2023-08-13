package com.citi.CustomerSessionPortal.controller;

import com.citi.CustomerSessionPortal.dto.CreateRequestDto;
import com.citi.CustomerSessionPortal.dto.CreateResponseDto;
import com.citi.CustomerSessionPortal.entity.Session;
import com.citi.CustomerSessionPortal.exception.SessionCreationException;
import com.citi.CustomerSessionPortal.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/session")
public class SessionController {
    @Autowired
    SessionService sessionService;

    @PostMapping
    public ResponseEntity<CreateResponseDto> createSession(@RequestBody CreateRequestDto request) {
//        CreateResponseDto responseDto = sessionService.createSession(request);
//        return new ResponseEntity<>(responseDto, HttpStatus.OK);
        try {
            CreateResponseDto responseDto = sessionService.createSession(request);
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        } catch (SessionCreationException e) {
            // Handle the exception and return an appropriate error response
            return new ResponseEntity<>(new CreateResponseDto(), HttpStatus.BAD_REQUEST);
        }
    }
}