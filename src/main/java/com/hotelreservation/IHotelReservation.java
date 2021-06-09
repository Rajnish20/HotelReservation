package com.hotelreservation;

import java.util.List;

public interface IHotelReservation {

    void addHotel(String name, Integer weekdaysRate,Integer weekendRate);

    int findCheapestHotel(List<String> dates);

    int getSize();
}
