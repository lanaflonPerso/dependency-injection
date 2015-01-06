package org.randoomz.domain;

/**
 * Created by Gerard on 5/01/15.
 */
public class Pizza {
  private final String name;
  private final TypePizza type;
  private final double price;

  public Pizza(String name, TypePizza type, double price) {
    this.name = name;
    this.type = type;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public TypePizza getType() {
    return type;
  }

  public double getPrice() {
    return price;
  }

  @Override public String toString() {
    return "Pizza{" +
            "name='" + name + '\'' +
            ", type=" + type +
            ", price=" + price +
            '}';
  }

  public enum TypePizza {
    MARGHERITA, PEPPERONI, AMERICAN_HOT;
  }
}
