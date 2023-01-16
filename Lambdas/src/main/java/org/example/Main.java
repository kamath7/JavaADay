package org.example;

public class Main {
    public static void main(String[] args) {
        // Lambdas are to be only used with one single method. if multiple, don't use

//        Dog karadi = new Dog();

//        printFromInter(karadi);

////        printFromInter(() ->{
//            System.out.println("Awoooh from a wolf!");
//        });

//        printFromInter(() ->System.out.println("Rnaaah from an elephant"));

        Printable myAwesomePrintable = s ->System.out.println("Nice "+s);
        printFromInter(myAwesomePrintable);

    }

    static void printFromInter(Printable thing){
        thing.print("!");
    }
}