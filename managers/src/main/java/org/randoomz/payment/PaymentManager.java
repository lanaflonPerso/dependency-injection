package org.randoomz.payment;

import org.randoomz.domain.Payment;
import org.randoomz.domain.Pizza;

import java.util.List;

/**
 * Created by Gerard on 5/01/15.
 */
public interface PaymentManager {
  Payment payWithPayPal(List<Pizza> pizzas);

  Payment payWithCreditCard(List<Pizza> pizzas);
}
