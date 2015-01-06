package org.randoomz.pizza;

import org.randoomz.domain.Pizza;

import java.util.List;

/**
 * Created by Gerard on 5/01/15.
 */
public interface PizzaDao {
  List<Pizza> getAll();

  Pizza get(Pizza.TypePizza type);
}
