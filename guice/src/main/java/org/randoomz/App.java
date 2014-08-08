package org.randoomz;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.randoomz.pizza.PizzaMaker;
import org.randoomz.pizza.Pizzeria;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        final Injector injector = Guice.createInjector(new PizzaModule());
        final Pizzeria pizzeria = injector.getInstance(Pizzeria.class);
        pizzeria.pay(pizzeria.make());
    }
}
