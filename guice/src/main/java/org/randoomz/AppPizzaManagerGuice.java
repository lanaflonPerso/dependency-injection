package org.randoomz;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.randoomz.payment.PaymentManager;
import org.randoomz.pizza.PizzaManager;

import javax.inject.Inject;

/**
 * Hello world!
 */
public class AppPizzaManagerGuice implements Runnable {
  @Inject PizzaManager pizzaManager;
  @Inject PaymentManager paymentManager;

  public static void main(String[] args) {
    final Injector injector = Guice.createInjector(new PizzaManagerModuleGuice());
    final AppPizzaManagerGuice app = injector.getInstance(AppPizzaManagerGuice.class);
    app.run();
  }

  @Override public void run() {
    System.out.println(paymentManager.payWithPayPal(pizzaManager.menu()));
  }
}
