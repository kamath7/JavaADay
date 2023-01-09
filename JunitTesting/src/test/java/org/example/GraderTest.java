package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraderTest {

    @Test
    void thirtyNineShouldReturnF(){
        var grader = new Grader();
        assertEquals('F', grader.determineGrade(39));
    }

    @Test
    void sixtyNineShouldReturnD(){
        var grader = new Grader();
        assertEquals('D',grader.determineGrade(69));
    }

    @Test
    void shouldGetAnException(){
        var grader = new Grader();
        assertThrows(IllegalArgumentException.class, () -> {
            grader.determineGrade(-1);
        });
    }
}