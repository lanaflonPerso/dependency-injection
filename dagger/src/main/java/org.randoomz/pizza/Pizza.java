package org.randoomz.pizza;

import org.randoomz.pizza.recipes.Recipe;

/**
 * Created by gerard on 8/08/14.
 */
public class Pizza {
  private Recipe recipe;

  public Recipe getRecipe() {
    return recipe;
  }

  public void setRecipe(Recipe recipe) {
    this.recipe = recipe;
  }
}
