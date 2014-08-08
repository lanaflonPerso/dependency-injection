package org.randoomz.pizza;

import com.google.inject.Inject;
import org.randoomz.pizza.card.CreditCard;
import org.randoomz.pizza.card.PayPal;

/**
 * Created by gerard on 8/08/14.
 */
public class Pizzeria {

    private final PizzaMaker maker;
    private final CreditCard creditCard;

    @Inject
    public Pizzeria(PizzaMaker maker, @PayPal CreditCard creditCard) {
        this.maker = maker;
        this.creditCard = creditCard;
    }

    public Pizza make() {
        return maker.make();
    }

    public void pay(Pizza pizza) {
        creditCard.pay(pizza);
    }
}
