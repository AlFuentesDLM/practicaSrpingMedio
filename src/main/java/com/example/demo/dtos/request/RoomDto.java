package com.example.demo.dtos.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class RoomDto {
    @NotBlank(message = "El nombre esta vacio")
    @NotNull(message = "El nombre esta nulo")
    private String name;
    @Max(message = "Menor a 100", value = 1000)
    @Min(message = "Mayor a 10", value = 10)
    private int width;
    @Max(message = "Menor a 100", value = 100)
    @Min(message = "Mayor a 10", value = 10)
    private int length;

    public Integer getSquareMeters(){
        return width*length;
    }
}
