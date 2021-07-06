package com.example.demo.dtos.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@Validated
public class GradeDto {
    @NotNull(message = "el nombre del estudiante no puede estar vacio")
    private String name;
    @Min(message = "La nota no puede ser peor que 0",value = 0)
    @Max(message = "La nota no puede ser mayor a 10",value = 10)
    private int grade;
}
