package com.magic.hotelreservation.services;

import com.magic.hotelreservation.entity.Hotels;

import java.util.List;


public interface IOperations {

    void addHotel(String name, Integer rate);

    Hotels findCheapestHotel(List<String> dates);

    int getSize();
}
