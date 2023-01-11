package org.example;


import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        String[] friends = new String[10];
        //Array always fixed size

        String[] indianDishes = {"Palak Paneer", "Jeera Rice","Rasmalai","Garlic Naan"};

        ArrayList<String> mangaloreanDishes = new ArrayList<>();
        //No fixed size. can grow and shrink

        ArrayList<String> indianDishesInAL = new ArrayList<>(Arrays.asList(indianDishes));

        //ArrayList can hold Objects not primitives.
        System.out.println(indianDishesInAL);

        //Get val in arr
        System.out.println(indianDishes[0]);

        //Get val in Arrl
        System.out.println(indianDishesInAL.get(0));
        System.out.println(indianDishes.length+ " "+indianDishesInAL.size());

        indianDishesInAL.add("Mango Lassi");
        indianDishesInAL.set(0, "Paneer Butter Masala");
        System.out.println(indianDishesInAL);
        indianDishesInAL.remove(2);

        System.out.println(indianDishes);
        System.out.println(indianDishesInAL);

        indianDishesInAL.forEach((elem) -> System.out.println(elem));
    }
}