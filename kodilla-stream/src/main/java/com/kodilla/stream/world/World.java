package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public void addContinents(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        BigDecimal sumOfPeople = continents.stream()
                .flatMap(f -> f.getContinentCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
        return sumOfPeople;
    }
}

