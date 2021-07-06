package com.example.demo.handlers;

import com.example.demo.dtos.request.AgeRequestDTO;
import java.util.Calendar;

public class AgeHandler {
    private static final Long ageInMilli = 31556952000L;
    public static Long getAge(AgeRequestDTO age){
        var date = Calendar.getInstance();
        date.set(age.getYear(),age.getMonth()-1,age.getDay());
        var oldTimestamp = date.getTimeInMillis();
        var currentTimestamps = System.currentTimeMillis();
        var timePassed = currentTimestamps-oldTimestamp;
        var years = timePassed/ageInMilli;
        return years;
    }

}
