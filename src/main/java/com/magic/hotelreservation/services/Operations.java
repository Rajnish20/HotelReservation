package com.magic.hotelreservation.services;

import com.magic.hotelreservation.entity.Hotels;

import java.util.ArrayList;
import java.util.List;

public class Operations implements IOperations {

    List<Hotels> hotels = new ArrayList<>();

    @Override
    public void addHotel(String name, Integer rate) {
        hotels.add(new Hotels(name, rate));
    }

    @SafeVarargs
    @Override
    public final <E> Hotels findCheapestHotel(E ... dates) {
        Hotels hotel = hotels.get(0);
        for (int i = 1; i < hotels.size(); i++) {
            if (hotel.getRate() > hotels.get(i).getRate())
                hotel = hotels.get(i);
        }
        int price = dates.length * hotel.getRate();
        return new Hotels(hotel.getName(),price);
    }

    @Override
    public int getSize() {
        return this.hotels.size();
    }
}
