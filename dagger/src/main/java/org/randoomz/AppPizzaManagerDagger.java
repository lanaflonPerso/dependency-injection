package org.randoomz;

import dagger.ObjectGraph;
import org.randoomz.payment.PaymentManager;
import org.randoomz.pizza.PizzaManager;

import javax.inject.Inject;

/**
 * Hello world!
 */
public class AppPizzaManagerDagger implements Runnable {
  @Inject PizzaManager pizzaManager;
  @Inject PaymentManager paymentManager;

  public static void main(String[] args) {
    final ObjectGraph objectGraph = ObjectGraph.create(new PizzaManagerModuleDagger());
    final AppPizzaManagerDagger app = objectGraph.get(AppPizzaManagerDagger.class);
    app.run();
  }

  @Override public void run() {
    System.out.println(paymentManager.payWithPayPal(pizzaManager.menu()));
  }
}
