package com.magic.hotelreservation;

import com.magic.hotelreservation.services.HotelReservation;
import com.magic.hotelreservation.services.IHotelReservation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class HotelReservationTest {

    @Test
    public void givenNameAndRate_AddedToList_ShouldReturnSizeThree() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110,90);
        operations.addHotel("BridgeWood", 150,50);
        operations.addHotel("RidgeWood", 220,150);
        int size = operations.getSize();
        Assertions.assertEquals(3, size);

    }

    @Test
    public void givenDates_ShouldReturnCheapestPrice() {
        IHotelReservation operations = new HotelReservation();
        operations.addHotel("LakeWood", 110,90);
        operations.addHotel("BridgeWood", 150,50);
        operations.addHotel("RidgeWood", 220,150);
        List<String> dates = Arrays.asList("10/9/2020", "11/9/2020");
        int price = operations.findCheapestHotel(dates);
        Assertions.assertEquals(220, price);
    }

}
