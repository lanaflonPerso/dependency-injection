package org.randoomz;

import com.google.inject.AbstractModule;
import org.randoomz.coffee.*;

/**
 * Created by gerard on 6/08/14.
 */
public class CoffeeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Coffee.class).to(Espresso.class);
        bind(Heater.class).to(ElectricHeater.class);
    }
}
