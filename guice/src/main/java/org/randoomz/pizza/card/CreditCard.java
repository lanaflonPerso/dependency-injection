package org.randoomz.pizza.card;

import org.randoomz.pizza.Pizza;
import org.randoomz.pizza.recipes.Recipe;

/**
 * Created by gerard on 8/08/14.
 */
public interface CreditCard {

    void pay(Pizza pizza);

    void setApiKey(String apiKey);
}
