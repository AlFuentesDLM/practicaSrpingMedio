package com.example.demo.controllers;

import com.example.demo.dtos.request.AgeRequestDTO;
import com.example.demo.dtos.response.AgeResponseDto;
import com.example.demo.handlers.AgeHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DtoAge {
    @RequestMapping(value = "/age/{day}/{month}/{year}",method = RequestMethod.GET)
    public ResponseEntity<AgeResponseDto> getAge(@Valid AgeRequestDTO age){
        var response = new AgeResponseDto(
                AgeHandler.getAge(age)
        );
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
