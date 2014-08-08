package org.randoomz.coffee;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Created by gerard on 6/08/14.
 */
public class CoffeeMachine {

    @Inject
    private Coffee coffee;
    @Inject
    private Heater heater;
    @Inject
    private Provider<Water> water;

    public CoffeeMachine() {
    }

    public void make() {
        System.out.println("Make " + coffee.getCoffee() + " ... with " + water.get() + " ... and " + heater.getHeater());
    }
}
