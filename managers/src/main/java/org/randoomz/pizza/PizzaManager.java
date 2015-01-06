package org.randoomz.pizza;

import org.randoomz.domain.Pizza;

import java.util.List;

/**
 * Created by Gerard on 19/12/14.
 */
public interface PizzaManager {
  List<Pizza> menu();

  Pizza margherita();

  Pizza pepperoni();

  Pizza americanHot();
}
