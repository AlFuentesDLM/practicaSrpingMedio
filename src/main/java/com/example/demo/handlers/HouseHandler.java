package com.example.demo.handlers;

import com.example.demo.dtos.request.HouseRequestDto;
import com.example.demo.dtos.request.RoomDto;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class HouseHandler {
    public static int getSquareMeters(HouseRequestDto house) {
        int squareMeters = 0;
        for (RoomDto room : house.getRooms()) {
            squareMeters += room.getSquareMeters();
        }
        return squareMeters;
    }

    public static int houseValue(HouseRequestDto house) {
        return getSquareMeters(house) * 800;
    }

    public static RoomDto getBiggerRoom(HouseRequestDto house) {
        Optional room = house.getRooms().stream().max(Comparator.comparing(RoomDto::getSquareMeters));
        return  (RoomDto) room.get();
    }

    public static Map<String,Integer> getSquareMetersAllRooms(HouseRequestDto house){
        var mappedRooms = new HashMap<String,Integer>();
        for (RoomDto room:house.getRooms()) {
            mappedRooms.put(room.getName(),room.getSquareMeters());
        }
        return  mappedRooms;
    }
}
