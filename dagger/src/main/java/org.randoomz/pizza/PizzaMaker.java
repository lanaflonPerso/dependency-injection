package org.randoomz.pizza;

import org.randoomz.pizza.cooking.Cooking;
import org.randoomz.pizza.recipes.Recipe;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by gerard on 8/08/14.
 */
public class PizzaMaker {

  @Inject Cooking cooking;
  @Inject @Named("hot") Recipe recipe;

  public org.randoomz.pizza.Pizza make() {
    cooking.turnOn();
    return cooking.prepare(recipe);
  }
}
