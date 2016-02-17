package com.yolimi.sancc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {

    private Car car;

    @Before
    public void setup() {
        car = new Car("V70", Car.Color.BLACK, Car.Direction.EAST, 0, 0);
    }

    @Test
    public void testGo() {
        Assert.assertEquals(1, car.go().getX());
    }
}
