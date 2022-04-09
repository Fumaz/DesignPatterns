package dev.fumaz.designpatterns.adapter;

public class AdattatoreFormaQuadrata extends FormaCircolare {
    private FormaQuadrata formaQuadrata;

    public AdattatoreFormaQuadrata(FormaQuadrata formaQuadrata) {
        this.formaQuadrata = formaQuadrata;
    }

    @Override
    public double getRaggio() {
        return Math.sqrt(Math.pow((formaQuadrata.getLunghezza() / 2), 2) * 2);
    }

}