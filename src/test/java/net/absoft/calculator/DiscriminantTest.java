package net.absoft.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscriminantTest {

    @Test
    public void discriminantGreaterthanZero() {
        QuadraticEquationCalculator calculator = new QuadraticEquationCalculator();
        Solution discriminant = calculator.discriminant(1, -4, -5);
        double expectedX1 = 5;
        double expectedX2 = -1;
        Assert.assertEquals(discriminant.x1, expectedX1);
        Assert.assertEquals(discriminant.x2, expectedX2);
    }

    @Test
    public void discriminantLessthanZero() {
        QuadraticEquationCalculator calculator = new QuadraticEquationCalculator();
        Solution discriminant = calculator.discriminant(3, -4, 2);
        Assert.assertEquals(discriminant, null);
    }

    @Test
    public void discriminantIsthanZero() {
        QuadraticEquationCalculator calculator = new QuadraticEquationCalculator();
        Solution discriminant = calculator.discriminant(1, -6, 9);
        double expectedX1 = 3;
        double expectedX2 = 3;
        Assert.assertEquals(discriminant.x1, expectedX1);
        Assert.assertEquals(discriminant.x2, expectedX2);
    }
}

