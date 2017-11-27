package com.kodilla.stream.world;
import java.math.BigDecimal;
import java.util.List;

public final class World {
    private final List<Continent> continentList;

    public World(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public BigDecimal getPeopleQuantity(){
        return continentList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulationOfCountry)
                .reduce(BigDecimal.ZERO, (sum,currant) -> sum = sum.add(currant));
    }
}
