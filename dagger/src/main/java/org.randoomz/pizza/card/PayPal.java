package org.randoomz.pizza.card;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by gerard on 9/08/14.
 */
@Qualifier
@Documented
@Retention(RUNTIME)
public @interface PayPal {
}
