package com.example.demo.handlers;

import com.example.demo.dtos.request.GradeDto;
import com.example.demo.dtos.request.StudentRequestDto;

public class StudentHandler{
    public static int getAverage(StudentRequestDto student){
        var count = 0;
        var acum = 0;
        for (GradeDto grade: student.getGrades()) {
            acum +=grade.getGrade();
            count++;
        }
        return  acum/count;
    }

    public static String sendMessage(StudentRequestDto student){
        var average = getAverage(student);
        if(average > 8){
            return "Alumno graduado con honores";
        }else if(average > 5){
            return "Alumno graduado";
        }else{
            return "Alumno reprobado";
        }
    }

}
