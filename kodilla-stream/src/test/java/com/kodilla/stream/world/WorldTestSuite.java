package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorldTestSuite {
    @Test
    void testGetPeopleQuantity() {

        //Given
        World world = new World();

        Continent asia = new Continent();
        Continent africa = new Continent();
        Continent europe = new Continent();

        //When
        asia.addCountry(new Country("Hongkong", new BigDecimal("1000000000")));
        asia.addCountry(new Country("Szanghai", new BigDecimal("1000000000")));

        africa.addCountry(new Country("Angola", new BigDecimal("1000000000")));
        africa.addCountry(new Country("Algieria", new BigDecimal("1000000000")));

        europe.addCountry(new Country("Poland", new BigDecimal("1000000000")));
        europe.addCountry(new Country("Germany", new BigDecimal("1000000000")));

        world.addContinents(asia);
        world.addContinents(africa);
        world.addContinents(europe);


        BigDecimal totalPeople = world.getPeopleQuantity();


        //Then
        BigDecimal expectedPeople = new BigDecimal("6000000000");      // [4]
        assertEquals(expectedPeople, totalPeople);

    }
}
