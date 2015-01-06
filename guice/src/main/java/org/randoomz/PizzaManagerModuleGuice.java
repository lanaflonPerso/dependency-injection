package org.randoomz;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import org.randoomz.domain.Payment;
import org.randoomz.payment.*;
import org.randoomz.pizza.PizzaDao;
import org.randoomz.pizza.PizzaDaoImpl;
import org.randoomz.pizza.PizzaManager;
import org.randoomz.pizza.PizzaManagerImpl;

import java.util.Calendar;
import java.util.UUID;

/**
 * Created by Gerard on 5/01/15.
 */
public class PizzaManagerModuleGuice extends AbstractModule {
  @Override protected void configure() {
    bind(PizzaManager.class).to(PizzaManagerImpl.class);
    bind(PizzaDao.class).to(PizzaDaoImpl.class);
    bind(PaymentManager.class).to(PaymentManagerImpl.class);
    bind(AbstractPayment.class).annotatedWith(Names.named("creditcard")).to(CreditCardPayment.class);
  }

  @Provides @PayPal public AbstractPayment providePayPal() {
    return new PayPalPayment();
  }

  @Provides public Payment providePayment() {
    return new Payment(UUID.randomUUID().toString(), Calendar.getInstance().getTime());
  }
}