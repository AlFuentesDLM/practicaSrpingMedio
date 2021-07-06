package com.example.demo.dtos.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Validated
public class AgeRequestDTO {
    @Max(message="el dia no puede ser mayor a 31",value = 31)
    @Min(message = "El dia no puede ser menor a 1",value=1)
    private  int day;
    @Max(message="el dia no puede ser mayor a 31",value = 12)
    @Min(message = "El dia no puede ser menor a 1",value=1)
    private int month;
    @Max(message="el dia no puede ser mayor a 10000",value = 10000)
    @Min(message = "El dia no puede ser menor a 1",value=1)
    private  int year;
}
