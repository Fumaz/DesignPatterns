package dev.fumaz.designpatterns.adapter;

public class FormaQuadrata {
    private double lunghezza;

    public FormaQuadrata(double lunghezza) {
        this.lunghezza = lunghezza;
    }

    public double getLunghezza() {
        return lunghezza;
    }

    public double getArea() {
        return Math.pow(lunghezza, 2);
    }
}