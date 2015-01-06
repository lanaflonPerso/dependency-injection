package org.randoomz.payment;

import org.randoomz.domain.Pizza;

import java.util.List;

/**
 * Created by Gerard on 5/01/15.
 */
public abstract class AbstractPayment {
  public double pay(List<Pizza> pizzas) {
    return pizzas.stream().mapToDouble(Pizza::getPrice).sum();
  }
}
