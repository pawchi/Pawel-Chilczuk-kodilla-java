package com.kodilla.testing.shape;
import org.junit.*;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {

        ShapeCollector shapeCollector;
        private static int testCounter = 0;

        @Before
        public void beforeEveryTest() {
            shapeCollector = new ShapeCollector();
            testCounter++;
            System.out.println("Preparing to execute test #"+testCounter);
        }
        @After
        public void after(){
            System.out.println("Test end");
        }

        @Test
        public void testAddFigure(){
            //Given
            Shape circle = new Circle(5.0);


            //When
            shapeCollector.addFigure(circle);

            //Then
            Assert.assertEquals(1,shapeCollector.shapeLibrary.size());
        }
        @Test
        public void testRemoveFigure(){
            //Given
            Shape circle = new Circle(5.0);
            shapeCollector.addFigure(circle);

            //When
            shapeCollector.removeFigure(circle);

            //Then
            Assert.assertEquals(0,shapeCollector.shapeLibrary.size());

        }
        @Test
        public void testGetFigure(){
            //Given
            Shape circle = new Circle(5.0);
            shapeCollector.addFigure(circle);

            //When
            Shape result = shapeCollector.getFigure(0);
            //Then
            Assert.assertEquals(circle,result);

        }
        @Test
        public void testShowFigures() {
            //Given
            Shape circle = new Circle(5.0);
            Shape squere = new Squere(3.0);
            Shape triangle = new Triangle(5.0,4.0);

            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(squere);
            shapeCollector.addFigure(triangle);
            String expected = "CircleSquereTriangle";

            //When
            String result = shapeCollector.showFigures();
            //Then
            Assert.assertEquals(expected,result);

        }
        }
