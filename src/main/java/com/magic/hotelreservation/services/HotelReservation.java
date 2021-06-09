package com.magic.hotelreservation.services;

import com.magic.hotelreservation.entity.Hotels;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;

public class HotelReservation implements IHotelReservation{

    List<Hotels> hotels = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");

    @Override
    public void addHotel(String name, Integer weekdaysRate, Integer weekendRate) {
        hotels.add(new Hotels(name, weekdaysRate, weekendRate));
    }

    @Override
    public int findCheapestHotel(List<String> dates) {
        List<String> days = new ArrayList<>();
        HashMap<String, Integer> hotelNameAndPrice = new HashMap<>();
        hotelNameAndPrice.put("LakeWood", 0);
        hotelNameAndPrice.put("BridgeWood", 0);
        hotelNameAndPrice.put("RidgeWood", 0);
        int price;
        String hotelName;
        for (String date : dates)
            days.add(LocalDate.parse(date, formatter).getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.US));
        for (String day : days) {
            if (day.equals("Sat") || day.equals("Sun")) {
                for (Hotels hotel : hotels) {
                    price = hotel.getWeekendRate();
                    hotelName = hotel.getName();
                    hotelNameAndPrice.put(hotelName, hotelNameAndPrice.get(hotelName) + price);
                }
            } else {
                for (Hotels hotel : hotels) {
                    price = hotel.getWeekdaysRate();
                    hotelName = hotel.getName();
                    hotelNameAndPrice.put(hotelName, hotelNameAndPrice.get(hotelName) + price);
                }
            }
        }

        Map.Entry<String, Integer> minimumPrice = Collections.min(hotelNameAndPrice.entrySet(),
                Map.Entry.comparingByValue());

        for (Map.Entry<String, Integer> entry : hotelNameAndPrice.entrySet())
            if (entry.getValue().equals(minimumPrice.getValue())) {
                System.out.print(entry.getKey()+ " " +entry.getValue()+ " ");
            }
        return minimumPrice.getValue();
    }

    @Override
    public int getSize() {
        return this.hotels.size();
    }
}
