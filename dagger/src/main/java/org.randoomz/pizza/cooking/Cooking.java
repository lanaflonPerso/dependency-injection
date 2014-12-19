package org.randoomz.pizza.cooking;

import org.randoomz.pizza.Pizza;
import org.randoomz.pizza.recipes.Recipe;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by Gerard on 26/10/14.
 */
public abstract class Cooking {
  @Inject Provider<Pizza> pizzaProvider;

  public abstract void turnOn();

  public Pizza prepare(Recipe recipe) {
    System.out.println("... prepare " + recipe.getName() + " ...");
    System.out.println("... pizza in progress ...");
    System.out.println("... Oh wait, I'm a program ...");
    System.out.println("... Your pizza is ready ! ...");
    final Pizza pizza = pizzaProvider.get();
    pizza.setRecipe(recipe);
    return pizza;
  }
}
