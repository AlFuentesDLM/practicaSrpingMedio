package com.example.demo.dtos.response;

import com.example.demo.dtos.request.RoomDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

@Data
@AllArgsConstructor
public class StudentResponseDto{

    private String message;
    private int average;
    private String name;

}
