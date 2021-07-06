package com.example.demo.dtos.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;
import java.util.ArrayList;

@Data
@Validated
public class StudentRequestDto{

    @NotNull(message = "El nombre es nulo")
    private String name;
    @NotEmpty(message = "Esta coleccion esta vacio")
    private ArrayList<GradeDto> grades;
}
