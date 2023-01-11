package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> namesLinkedList = new LinkedList<>();

        ArrayList<String> mangaloreanDishes = new ArrayList<>();

        namesLinkedList.add("Kevin");
        namesLinkedList.add("Holly");
        namesLinkedList.add("Meredith");
        namesLinkedList.add("Michael");


        mangaloreanDishes.add("Pundi");
        mangaloreanDishes.add("Marwai Sukka");
        mangaloreanDishes.add("Dalitoy");
        mangaloreanDishes.add("Patholi");

        String[] names = new String[4];

        //Linkedlist in Java is doubly linked list. where the element has references to both the previous and next element

        System.out.println(namesLinkedList.get(0));
    }
}