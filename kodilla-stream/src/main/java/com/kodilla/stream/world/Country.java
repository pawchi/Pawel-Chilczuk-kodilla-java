package com.kodilla.stream.world;
import java.math.BigDecimal;

public final class Country {

        private final String countryName;
        private final BigDecimal populationOfCountry;

    public Country(final String countryName, final BigDecimal populationOfCountry) {
        this.countryName = countryName;
        this.populationOfCountry = populationOfCountry;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPopulationOfCountry() {
        return populationOfCountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (!countryName.equals(country.countryName)) return false;
        return populationOfCountry.equals(country.populationOfCountry);
    }

    @Override
    public int hashCode() {
        int result = countryName.hashCode();
        result = 31 * result + populationOfCountry.hashCode();
        return result;
    }
}
