package com.magic.hotelreservation;

import com.magic.hotelreservation.entity.Hotels;
import com.magic.hotelreservation.services.IOperations;
import com.magic.hotelreservation.services.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HotelReservationTest {

    @Test
    public void givenNameAndRate_AddedToList_ShouldReturnSizeThree() {
        IOperations operations = new Operations();
        operations.addHotel("LakeWood", 110);
        operations.addHotel("BridgeWood", 160);
        operations.addHotel("RidgeWood", 220);
        int size = operations.getSize();
        Assertions.assertEquals(3, size);
    }

    @Test
    public void givenDates_ShouldReturnCheapestPrice() {
        IOperations operations = new Operations();
        operations.addHotel("LakeWood", 110);
        operations.addHotel("BridgeWood", 160);
        operations.addHotel("RidgeWood", 220);
        List<String> dates = Arrays.asList("10/9/2020", "11/9/2020");
        Hotels hotel = operations.findCheapestHotel(dates);
        int price = hotel.getRate();
        System.out.println(hotel.toString());
        Assertions.assertEquals(220, price);
    }


}
