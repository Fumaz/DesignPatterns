package dev.fumaz.designpatterns.builder;

public class Main {

    public static void main(String[] args) {
        // Codice terribile, senza builder.
        Pizza pizza = new Pizza(1, true, false, false, true, true);

        // Codice pulito, con builder.
        Pizza pizza2 = new PizzaBuilder(1)
                .withFormaggio()
                .withProsciutto()
                .withCipolla()
                .build();
    }
    
}
