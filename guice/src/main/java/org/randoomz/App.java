package org.randoomz;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.randoomz.coffee.Coffee;
import org.randoomz.coffee.CoffeeMachine;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new CoffeeModule());
        CoffeeMachine coffeeMachine = injector.getInstance(CoffeeMachine.class);
        coffeeMachine.make();
    }
}
