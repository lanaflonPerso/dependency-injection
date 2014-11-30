package org.randoomz.pizza.card;

import org.randoomz.pizza.Pizza;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by gerard on 9/08/14.
 */
public class PayPalCreditCard implements org.randoomz.pizza.card.CreditCard {
  private String apiKey;

  @Override public void pay(Pizza pizza) {
    if (apiKey == null || apiKey.isEmpty()) {
      System.out.println("To pay your pizza, you must specify an api key !");
    } else {
      NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.getDefault());
      final String price = numberFormat.format(pizza.getRecipe().getPrice());
      System.out.println("Your pizza cost " + price + " but ...");
      final String realPrice = numberFormat.format(1000000.0);
      System.out.println("I stole you " + realPrice + " !");
    }
  }

  @Override public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }
}
