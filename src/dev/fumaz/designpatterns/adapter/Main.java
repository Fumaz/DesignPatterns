package dev.fumaz.designpatterns.adapter;

public class Main {

    public static void main(String[] args) {
        BucoCircolare buco = new BucoCircolare(5);
        FormaCircolare formaCircolare = new FormaCircolare(5);

        if (buco.contiene(formaCircolare)) {
            System.out.println("Forma circolare puó essere contenuta nel buco circolare");
        }

        FormaQuadrata piccolaFormaQuadrata = new FormaQuadrata(2);
        FormaQuadrata grandeFormaQuadrata = new FormaQuadrata(20);
//        buco.contiene(piccolaFormaQuadrata); NON COMPILA!!

        // Adapter risolve il problema
        AdattatoreFormaQuadrata piccoloAdattatoreFormaQuadrata = new AdattatoreFormaQuadrata(piccolaFormaQuadrata);
        AdattatoreFormaQuadrata grandeAdattatoreFormaQuadrata = new AdattatoreFormaQuadrata(grandeFormaQuadrata);

        if (buco.contiene(piccoloAdattatoreFormaQuadrata)) {
            System.out.println("Forma quadrata piccola puó essere contenuta nel buco circolare");
        }

        if (!buco.contiene(grandeAdattatoreFormaQuadrata)) {
            System.out.println("Forma quadrata grande NON puó essere contenuta nel buco circolare");
        }
    }

}