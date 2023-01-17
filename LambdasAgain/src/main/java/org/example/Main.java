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
        System.out.println(comparator.compare("Kamath","Adithya"));
    }
}