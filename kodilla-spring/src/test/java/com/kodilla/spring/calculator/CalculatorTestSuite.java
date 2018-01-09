package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

        @Test
        public void testCalculationsAdd(){
            //Given
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Calculator calculator = context.getBean(Calculator.class);
            //When
            double val = calculator.add(5.0,2.0);

            //Then
            Assert.assertEquals(val,7.0,0.1);
        }

    @Test
    public void testCalculationsSub(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.sub(5.0,2.0);

        //Then
        Assert.assertEquals(val,3.0,0.1);
    }

    @Test
    public void testCalculationsMul(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.mul(5.0,2.0);

        //Then
        Assert.assertEquals(val,10.0,0.1);
    }

    @Test
    public void testCalculationsDiv(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double val = calculator.div(5.0,2.0);

        //Then
        Assert.assertEquals(val,2.5,0.1);
    }
}
