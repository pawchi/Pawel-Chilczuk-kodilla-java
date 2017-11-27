package com.kodilla.stream;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){

        //Given
        Country poland = new Country("Poland", BigDecimal.valueOf(30000000));
        Country germany = new Country("Germany", BigDecimal.valueOf(85000000));
        Country hungary = new Country("Hungary",BigDecimal.valueOf(12000000));
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(germany);
        europeCountries.add(hungary);
        Continent europe = new Continent("Europe",europeCountries);

        Country china = new Country("China",BigDecimal.valueOf(1300000000));
        Country japan = new Country("Japan",BigDecimal.valueOf(100000000));
        Country laos = new Country("Laos",BigDecimal.valueOf(50000000));
        List<Country> asianCountries = new ArrayList<>();
        asianCountries.add(china);
        asianCountries.add(japan);
        asianCountries.add(laos);
        Continent asia = new Continent("Asia",asianCountries);

        List<Continent> continentList = new ArrayList<>();
        continentList.add(europe);
        continentList.add(asia);

        //When
        BigDecimal resultAllPeople = continentList.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPopulationOfCountry)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


        //Then
        BigDecimal expectedResult = new BigDecimal("1577000000");
        Assert.assertEquals(expectedResult,resultAllPeople);

    }
}
