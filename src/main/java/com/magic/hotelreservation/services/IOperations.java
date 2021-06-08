package com.magic.hotelreservation.services;

import com.magic.hotelreservation.entity.Hotels;


public interface IOperations {

    void addHotel(String name, Integer rate);

    <E> Hotels findCheapestHotel(E... dates);

    int getSize();
}
