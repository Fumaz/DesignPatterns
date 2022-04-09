package dev.fumaz.designpatterns.observer;

public class Main {

    public static void main(String[] args) {
        Negozio negozio = new Negozio();

        Osservatore osservatoreVendita = messaggio -> {
            System.out.println("Il negozio ha venduto " + messaggio);
        };

        Osservatore osservatoreRitiro = messaggio -> {
            System.out.println("Il negozio ha ritirato " + messaggio);
        };

        negozio.iscrivi(Eventi.VENDITA, osservatoreVendita);
        negozio.iscrivi(Eventi.RITIRO, osservatoreRitiro);

        negozio.notifica(Eventi.VENDITA, "Caffè");
        negozio.notifica(Eventi.RITIRO, "iPhone 13");
    }

}
