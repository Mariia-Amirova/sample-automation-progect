package net.absoft.calculator;


import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

    @Test
    public void isoscelesTriangle1() {
        Triangle triangle = new Triangle(2, 2, 3);
        int p = triangle.perimeter();
        int expectedP1 = 7;
        String type = triangle.type();
        String expectedType1 = "Isosceles triangle";
        Assert.assertEquals(p, expectedP1);
        Assert.assertEquals(type, expectedType1);


    }

    @Test
    public void isoscelesTriangle2() {
        Triangle triangle = new Triangle(2, 3, 2);
        int p = triangle.perimeter();
        int expectedP1 = 7;
        String type = triangle.type();
        String expectedType1 = "Isosceles triangle";
        Assert.assertEquals(p, expectedP1);
        Assert.assertEquals(type, expectedType1);


    }

    @Test
    public void isoscelesTriangle3() {
        Triangle triangle = new Triangle(3, 2, 2);
        int p = triangle.perimeter();
        int expectedP1 = 7;
        String type = triangle.type();
        String expectedType1 = "Isosceles triangle";
        Assert.assertEquals(p, expectedP1);
        Assert.assertEquals(type, expectedType1);


    }

    @Test
    public void checkVersatileTriangleAndPerimeter() {
        Triangle triangle = new Triangle(1, 2, 3);
        int expectedP1 = 6;
        String expectedType1 = "Versatile triangle";

        int p = triangle.perimeter();
        String type = triangle.type();

        Assert.assertEquals(p, expectedP1);
        Assert.assertEquals(type, expectedType1);
    }
}
