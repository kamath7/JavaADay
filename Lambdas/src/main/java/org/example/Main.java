package org.example;

public class Main {
    public static void main(String[] args) {

        Dog karadi = new Dog();

        printFromInter(karadi);

    }

    static void printFromInter(Printable thing){
        thing.print();
    }
}