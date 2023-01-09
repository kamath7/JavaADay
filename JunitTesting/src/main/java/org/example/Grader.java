package org.example;

public class Grader {
    public char determineGrade( int numberGrade){
        if (numberGrade < 0){
            throw new IllegalArgumentException("Number grade cannot be below 0");
        }else if (numberGrade < 60){
            return 'F';
        } else if (numberGrade < 70){
            return 'D';
        }else if (numberGrade < 80){
            return 'C';
        }
        return 'A';
    }
}
