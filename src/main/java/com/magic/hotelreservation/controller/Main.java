package com.magic.hotelreservation.controller;

import com.magic.hotelreservation.services.HotelReservation;
import com.magic.hotelreservation.services.IHotelReservation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110,90);
        operations.addHotel("BridgeWood", 150,50);
        operations.addHotel("RidgeWood", 220,150);
        List<String> dates = Arrays.asList("11/9/2020", "12/9/2020");
        int price = operations.findCheapestHotel(dates);
    }
}
