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
        operations.addHotel("LakeWood", 110,90);
        operations.addHotel("BridgeWood", 150,50);
        operations.addHotel("RidgeWood", 220,150);
        int size = operations.getSize();
        Assertions.assertEquals(3, size);

    }




}
