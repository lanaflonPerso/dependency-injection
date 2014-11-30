package org.randoomz;

import dagger.Module;
import dagger.Provides;
import org.randoomz.pizza.Pizza;
import org.randoomz.pizza.card.CreditCard;
import org.randoomz.pizza.card.PayPal;
import org.randoomz.pizza.card.PayPalCreditCard;
import org.randoomz.pizza.cooking.Cooking;
import org.randoomz.pizza.cooking.WoodFire;
import org.randoomz.pizza.recipes.Recipe;
import org.randoomz.pizza.recipes.Sicilian;

import javax.inject.Named;

/**
 * Created by Gerard on 26/10/14.
 */
@Module(
        injects = org.randoomz.App.class
)
public class PizzaModule {

  @Provides Cooking provideCooking() {
    return new WoodFire();
  }

  @Provides @Named("hot") Recipe provideRecipe() {
    return new Sicilian();
  }

  @Provides @PayPal CreditCard provideCreditCard() {
    final CreditCard creditCard = new PayPalCreditCard();
    creditCard.setApiKey("AwesomeApiKey");
    return creditCard;
  }
}
