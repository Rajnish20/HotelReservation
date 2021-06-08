package com.magic.hotelreservation;

import com.magic.hotelreservation.services.IOperations;
import com.magic.hotelreservation.services.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}
