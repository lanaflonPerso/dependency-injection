package org.randoomz;

import dagger.Module;
import dagger.Provides;
import org.randoomz.domain.Payment;
import org.randoomz.payment.AbstractPayment;
import org.randoomz.payment.CreditCardPayment;
import org.randoomz.payment.PayPal;
import org.randoomz.payment.PayPalPayment;
import org.randoomz.payment.PaymentManager;
import org.randoomz.payment.PaymentManagerImpl;
import org.randoomz.pizza.PizzaDao;
import org.randoomz.pizza.PizzaDaoImpl;
import org.randoomz.pizza.PizzaManager;
import org.randoomz.pizza.PizzaManagerImpl;

import javax.inject.Named;
import java.util.Calendar;
import java.util.UUID;

/**
 * Created by Gerard on 5/01/15.
 */
@Module(
        injects = AppPizzaManagerDagger.class
)
public class PizzaManagerModuleDagger {
  @Provides PizzaManager providePizzaManager(PizzaManagerImpl manager) {
    return manager;
  }

  @Provides PizzaDao providePizzaDao() {
    return new PizzaDaoImpl();
  }

  @Provides PaymentManager providePaymentManager(PaymentManagerImpl manager) {
    return manager;
  }

  @Provides @PayPal AbstractPayment providePayPal() {
    return new PayPalPayment();
  }

  @Provides @Named("creditcard") AbstractPayment provideCreditCard() {
    return new CreditCardPayment();
  }

  @Provides Payment providePayment() {
    return new Payment(UUID.randomUUID().toString(), Calendar.getInstance().getTime());
  }
}