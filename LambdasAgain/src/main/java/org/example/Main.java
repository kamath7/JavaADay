package org.example;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        };
        System.out.println(comparator.compare("Kamath","Kamath"));

        Comparator<String> comparatorLambda = (String s1, String s2) -> {return s1.compareTo(s2);}; //equivalent to the one above


        System.out.println(comparatorLambda.compare("Kamath","Kamath"));
        Comparator<String> comparatorBetterLambda = ( s1,  s2) ->  s1.compareTo(s2);
        System.out.println(comparatorBetterLambda.compare("Kamath","Kamath"));

        SimpleInter simpleInter = ( text,  text2)-> "Printing from Functional Interface. "+text+" "+text2;
        System.out.println(simpleInter.apply("Hello","World"));

        SimpleInter simpleInter1 = simpleInter;
        System.out.println((simpleInter1.apply("Hello","Kams")));
    }
}