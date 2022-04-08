package dev.fumaz.designpatterns.builder;

public class Pizza {

    private final int dimensione;
    private final boolean formaggio;
    private final boolean pomodoro;
    private final boolean salame;
    private final boolean prosciutto;
    private final boolean cipolla;

    // Questo costruttore é lunghissimo! Come faremo mai a ricordarci l'ordine dei parametri?
    public Pizza(int dimensione, boolean formaggio, boolean pomodoro, boolean salame, boolean prosciutto, boolean cipolla) {
        this.dimensione = dimensione;
        this.formaggio = formaggio;
        this.pomodoro = pomodoro;
        this.salame = salame;
        this.prosciutto = prosciutto;
        this.cipolla = cipolla;
    }

    public int getDimensione() {
        return dimensione;
    }

    public boolean isFormaggio() {
        return formaggio;
    }

    public boolean isPomodoro() {
        return pomodoro;
    }

    public boolean isSalame() {
        return salame;
    }

    public boolean isProsciutto() {
        return prosciutto;
    }

    public boolean isCipolla() {
        return cipolla;
    }
}
