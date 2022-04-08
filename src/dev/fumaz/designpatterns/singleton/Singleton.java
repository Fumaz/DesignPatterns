package dev.fumaz.designpatterns.singleton;

public class Singleton {

    private static Singleton instance;

    private int numero;

    // Il costruttore è privato per impedire la creazione di altre istanze
    private Singleton() {
        this.numero = 0;
    }

    // Metodo per ottenere l'istanza della classe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
