package com.magic.hotelreservation.services;

import com.magic.hotelreservation.entity.Hotels;

import java.util.ArrayList;
import java.util.List;

public class Operations implements IOperations {

    List<Hotels> hotels = new ArrayList<>();

    @Override
    public void addHotel(String name, Integer weekdaysRate,Integer weekendRate) {
        hotels.add(new Hotels(name, weekdaysRate, weekendRate));
    }

    @Override
    public int getSize() {
        return this.hotels.size();
    }
}
