package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                            .burgers(2)
                            .roll("without sesame")
                            .sauce("standard")
                            .ingredient("chilli")
                            .ingredient("double cheese")
                            .ingredient("onion")
                            .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        System.out.println(bigmac);

        //Then
        Assert.assertEquals(3,howManyIngredients);
    }
}
