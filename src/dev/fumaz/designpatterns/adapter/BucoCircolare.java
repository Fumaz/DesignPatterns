package dev.fumaz.designpatterns.adapter;

public class BucoCircolare {
    private double raggio;

    public BucoCircolare(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public boolean contiene(FormaCircolare forma) {
        return this.getRaggio() >= forma.getRaggio();
    }
}