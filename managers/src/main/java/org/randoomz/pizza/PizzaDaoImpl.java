package org.randoomz.pizza;

import org.randoomz.domain.Pizza;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Gerard on 5/01/15.
 */
@Singleton
public class PizzaDaoImpl implements PizzaDao {
  private final Map<Pizza.TypePizza, Pizza> database = new HashMap<>();

  {
    database.put(Pizza.TypePizza.MARGHERITA, new Pizza("Margherita", Pizza.TypePizza.MARGHERITA, 6.20));
    database.put(Pizza.TypePizza.PEPPERONI, new Pizza("Pepperoni", Pizza.TypePizza.PEPPERONI, 7.40));
    database.put(Pizza.TypePizza.AMERICAN_HOT, new Pizza("American Hot", Pizza.TypePizza.AMERICAN_HOT, 8.10));
  }

  @Override public List<Pizza> getAll() {
    return new ArrayList<>(database.values());
  }

  @Override public Pizza get(Pizza.TypePizza type) {
    return database.get(type);
  }
}
