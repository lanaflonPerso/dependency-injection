package org.randoomz;

import dagger.ObjectGraph;
import org.randoomz.pizza.Pizzeria;

import javax.inject.Inject;

/**
 * Hello world!
 */
public class App implements Runnable {
  @Inject Pizzeria pizzeria;

  public static void main(String[] args) {
    final ObjectGraph objectGraph = ObjectGraph.create(new org.randoomz.PizzaModule());
    final App app = objectGraph.get(App.class);
    app.run();
  }

  @Override public void run() {
    pizzeria.pay(pizzeria.make());
  }
}
