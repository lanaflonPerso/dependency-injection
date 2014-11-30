package org.randoomz.pizza;

import org.randoomz.pizza.card.CreditCard;
import org.randoomz.pizza.card.PayPal;

import javax.inject.Inject;

/**
 * Created by gerard on 8/08/14.
 */
public class Pizzeria {

  private final org.randoomz.pizza.PizzaMaker maker;
  private final CreditCard creditCard;

  @Inject public Pizzeria(org.randoomz.pizza.PizzaMaker maker, @PayPal CreditCard creditCard) {
    this.maker = maker;
    this.creditCard = creditCard;
  }

  public org.randoomz.pizza.Pizza make() {
    return maker.make();
  }

  public void pay(org.randoomz.pizza.Pizza pizza) {
    creditCard.pay(pizza);
  }
}
