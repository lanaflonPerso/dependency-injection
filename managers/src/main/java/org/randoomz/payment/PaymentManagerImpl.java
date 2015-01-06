package org.randoomz.payment;

import org.randoomz.domain.Payment;
import org.randoomz.domain.Pizza;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;
import java.util.List;

/**
 * Created by Gerard on 5/01/15.
 */
@Singleton
public class PaymentManagerImpl implements PaymentManager {
  @Inject @PayPal AbstractPayment payPal;
  @Inject @Named("creditcard") AbstractPayment creditCard;
  @Inject Provider<Payment> paymentProvider;

  @Override public Payment payWithPayPal(List<Pizza> pizzas) {
    return getPayment(payPal.pay(pizzas));
  }

  @Override public Payment payWithCreditCard(List<Pizza> pizzas) {
    return getPayment(creditCard.pay(pizzas));
  }

  private Payment getPayment(double total) {
    final Payment payment = paymentProvider.get();
    payment.setTotal(total);
    return payment;
  }
}
