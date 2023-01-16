package org.example;

public class Main {
    public static void main(String[] args) {

        Dog karadi = new Dog();

        printFromInter(karadi);

        printFromInter(() ->{
            System.out.println("Awoooh from a wolf!");
        });

        printFromInter(() ->System.out.println("Rnaaah from an elephant"));

    }

    static void printFromInter(Printable thing){
        thing.print();
    }
}