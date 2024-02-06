package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationTest {

    private Calculation calculation;

    @BeforeEach
    public void setUp() {
        calculation = new Calculation();

    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(calculation.add(1,1),2);
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(calculation.subtract(0,0),0); //if someone will make + instead of -1
       //Assertions.assertEquals(calculation.subtract(5,4),1); // replaced int return with 0 for org/mutation/Calculation::subtract → SURVIVED
    }

    @Test
    public void testMultiply() {
        Assertions.assertEquals(calculation.multiply(0,0),0);
        //Assertions.assertEquals(calculation.multiply(1,1),1);
    }

    @Test
    public void testDivide() {
        Assertions.assertEquals(calculation.divide(0,100),0);
        Assertions.assertEquals(calculation.divide(105,10),10);
    }

    @Test
    public void testSummation() {
        Assertions.assertEquals(calculation.summation(3),6);
        Assertions.assertEquals(calculation.summation(0),0);
        Assertions.assertEquals(calculation.summation(1),1);
    }
}
