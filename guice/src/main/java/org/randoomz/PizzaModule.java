package org.randoomz;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import org.randoomz.pizza.card.CreditCard;
import org.randoomz.pizza.card.PayPal;
import org.randoomz.pizza.card.PayPalCreditCard;
import org.randoomz.pizza.cooking.Cooking;
import org.randoomz.pizza.cooking.WoodFire;
import org.randoomz.pizza.recipes.Recipe;
import org.randoomz.pizza.recipes.Sicilian;

/**
 * Created by gerard on 8/08/14.
 */
public class PizzaModule extends AbstractModule {
  @Override protected void configure() {
    // Bind Cooking class to WoodFire class, because wood fire is the best cooking !
    bind(Cooking.class).to(WoodFire.class);
    // Bind abstract Recipe class to Sicilian class when the attribute is named by "hot" value.
    bind(Recipe.class).annotatedWith(Names.named("hot")).to(Sicilian.class);
  }

  @Provides @PayPal public CreditCard provideCreditCard() {
    final CreditCard creditCard = new PayPalCreditCard();
    creditCard.setApiKey("AwesomeApiKey");
    return creditCard;
  }
}
