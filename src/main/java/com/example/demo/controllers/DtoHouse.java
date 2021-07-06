package com.example.demo.controllers;

import com.example.demo.dtos.request.HouseRequestDto;
import com.example.demo.dtos.response.HouseResponseDto;
import com.example.demo.handlers.HouseHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/house")
public class DtoHouse {

    @PostMapping
    public ResponseEntity<HouseResponseDto> checkHouseValues(@Valid @RequestBody HouseRequestDto house){
        HouseResponseDto houseResponseDto = new HouseResponseDto(
               house.getName(),
                HouseHandler.getSquareMeters(house),
                HouseHandler.houseValue(house),
                HouseHandler.getBiggerRoom(house),
                HouseHandler.getSquareMetersAllRooms(house)
        );
        return  new ResponseEntity<>(houseResponseDto, HttpStatus.OK);
    }
}
