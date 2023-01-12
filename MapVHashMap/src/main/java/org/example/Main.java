package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(1,"Michael");
        employees.put(2,"Dwight");
        employees.put(3,"Jim");
        employees.put(4,"David");

        System.out.println(employees);

        System.out.println(employees.get(3));
    }
}