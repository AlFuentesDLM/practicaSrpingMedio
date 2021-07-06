package com.example.demo.dtos.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.ArrayList;

@Data
@Validated
public class HouseRequestDto {
    @Max(message = "Menor a 100", value = 100)
    @Min(message = "Mayor a 10", value = 10)
    private int id;

    @NotNull(message = "El DNI esta nulo")
    private String name;

    @NotBlank(message = "El nombre esta vacio")
    @NotNull(message = "El nombre esta nulo")
    private String address;

    @NotEmpty(message = "Esta coleccion esta vacio")
    private ArrayList<RoomDto> rooms;
}
