package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void twoPlusTwoAnswer(){
        Calculator calculator = new Calculator();
        assertEquals(4,calculator.add(2,2));
//        assertEquals(5, calculator.add(2,1)); //Will Fail
        assertTrue(calculator.add(2,2) == 4);
    }
    @Test
    void anotherAddition(){
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(3,7));
    }
}