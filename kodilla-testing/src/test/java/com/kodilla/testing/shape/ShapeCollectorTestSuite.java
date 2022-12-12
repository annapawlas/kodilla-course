package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterAll
    public static void afterAllTests(){
        System.out.println("All tests are finished.");
    }
    @BeforeEach
    public void beforeEachTest(){
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Tests for circle")
    class circleTests {
        @Test
        void testAddCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(3.14);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
        }

        @Test
        void testRemoveCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(3.14);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
        }

        @Test
        void testRemoveCircleNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(3.14);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testGetCircle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(3.14);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }

        @Test
        void testShowCircles(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(3.14);
            shapeCollector.addFigure(shape);
            //When
            List<Shape>shapeResult = shapeCollector.getShapeCollection();
            //Then
            Assertions.assertEquals(shapeCollector.showFigures(), shapeResult.toString());
        }

    }

    @Nested
    @DisplayName("Tests for square")
    class squareTests {
        @Test
        void testAddSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(3.14);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
        }

        @Test
        void testRemoveSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(3.14);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
        }

        @Test
        void testRemoveSquareNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(3.14);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testGetSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(3.14);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }

        @Test
        void testShowSquare(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(3.14);
            shapeCollector.addFigure(shape);
            //When
            List<Shape>shapeResult = shapeCollector.getShapeCollection();
            //Then
            Assertions.assertEquals(shapeCollector.showFigures(), shapeResult.toString());
        }
    }

    @Nested
    @DisplayName("Tests for triangle")
    class triangleTests {
        @Test
        void testAddTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(3.14);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.getShapeCollection().size());
        }

        @Test
        void testRemoveTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(3.14);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.getShapeCollection().size());
        }

        @Test
        void testRemoveTriangleNotExisting(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(3.14);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testGetTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(3.14);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedShape;
            retrievedShape = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }

        @Test
        void testShowTriangle(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(3.14);
            shapeCollector.addFigure(shape);
            //When
            List<Shape>shapeResult = shapeCollector.getShapeCollection();
            //Then
            Assertions.assertEquals(shapeCollector.showFigures(), shapeResult.toString());
        }
    }
}
