package dev.fumaz.designpatterns.builder;

public class PizzaBuilder {
    private final int dimensione;
    private boolean formaggio;
    private boolean pomodoro;
    private boolean salame;
    private boolean prosciutto;
    private boolean cipolla;

    public PizzaBuilder(int dimensione) {
        this.dimensione = dimensione;
    }

    public PizzaBuilder withFormaggio() {
        this.formaggio = true;
        return this;
    }

    public PizzaBuilder withPomodoro() {
        this.pomodoro = true;
        return this;
    }

    public PizzaBuilder withSalame() {
        this.salame = true;
        return this;
    }

    public PizzaBuilder withProsciutto() {
        this.prosciutto = true;
        return this;
    }

    public PizzaBuilder withCipolla() {
        this.cipolla = true;
        return this;
    }

    public Pizza build() {
        return new Pizza(dimensione, formaggio, pomodoro, salame, prosciutto, cipolla);
    }

}