package org.randoomz.pizza;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.randoomz.pizza.cooking.Cooking;
import org.randoomz.pizza.recipes.Recipe;

/**
 * Created by gerard on 8/08/14.
 */
public class PizzaMaker {

    @Inject
    private Cooking cooking;
    @Inject
    @Named("hot")
    private Recipe recipe;

    public Pizza make() {
        cooking.turnOn();
        return cooking.prepare(recipe);
    }
}
