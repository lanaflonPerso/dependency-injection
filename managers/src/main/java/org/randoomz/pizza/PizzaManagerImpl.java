package org.randoomz.pizza;

import org.randoomz.domain.Pizza;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by Gerard on 5/01/15.
 */
@Singleton
public class PizzaManagerImpl implements PizzaManager {
  private final PizzaDao pizzaDao;

  @Inject public PizzaManagerImpl(PizzaDao pizzaDao) {
    this.pizzaDao = pizzaDao;
  }

  @Override public List<Pizza> menu() {
    return pizzaDao.getAll();
  }

  @Override public Pizza margherita() {
    return pizzaDao.get(Pizza.TypePizza.MARGHERITA);
  }

  @Override public Pizza pepperoni() {
    return pizzaDao.get(Pizza.TypePizza.PEPPERONI);
  }

  @Override public Pizza americanHot() {
    return pizzaDao.get(Pizza.TypePizza.AMERICAN_HOT);
  }
}
