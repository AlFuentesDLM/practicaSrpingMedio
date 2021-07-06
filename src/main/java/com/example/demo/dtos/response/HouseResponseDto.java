package com.example.demo.dtos.response;

import com.example.demo.dtos.request.RoomDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class HouseResponseDto {
    private String houseName;
    private int squareMeter;
    private int houseValue;
    private RoomDto biggerRoom;
    private Map<String,Integer> roomSquareMeters;
}
