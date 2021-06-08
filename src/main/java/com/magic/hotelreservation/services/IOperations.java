package com.magic.hotelreservation.services;

import com.magic.hotelreservation.entity.Hotels;

import java.util.List;


public interface IOperations {

    void addHotel(String name, Integer weekdaysRate,Integer weekendRate);

    int getSize();
}
