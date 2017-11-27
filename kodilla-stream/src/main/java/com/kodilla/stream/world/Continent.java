package com.kodilla.stream.world;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

    private final String continentName;
    private final List<Country> countryList;

    public Continent(final String continentName, final List<Country> countryList) {
        this.continentName = continentName;
        this.countryList = countryList;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countryList);
    }

}
