package dev.fumaz.designpatterns.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("I due singleton sono uguali? " + (singleton1 == singleton2));
        System.out.println("Il numero del singleton1 é " + singleton1.getNumero());
        System.out.println("Il numero del singleton2 é " + singleton2.getNumero());

        singleton2.setNumero(5);

        System.out.println("Il numero del singleton1 é " + singleton1.getNumero());
        System.out.println("Il numero del singleton2 é " + singleton2.getNumero());
    }

}
