package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class Continent {
    private final Set<Country> continentCountries = new HashSet<>();

    public void addCountry(Country country) {
        continentCountries.add(country);
    }
    public Set<Country> getContinentCountries() {
        return continentCountries;
    }

}
