package org.randoomz.pizza.cooking;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.randoomz.pizza.Pizza;
import org.randoomz.pizza.recipes.Recipe;

/**
 * Created by gerard on 8/08/14.
 */
public abstract class Cooking {

    @Inject
    private Provider<Pizza> pizza;

    public abstract void turnOn();

    public Pizza prepare(Recipe recipe) {
        System.out.println("... prepare " + recipe.getName() + " ...");
        System.out.println("... pizza in progress ...");
        System.out.println("... Oh wait, I'm a program ...");
        System.out.println("... Your pizza is ready ! ...");
        final Pizza pizza = this.pizza.get();
        pizza.setRecipe(recipe);
        return pizza;
    }
}
