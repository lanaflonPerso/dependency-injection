package org.randoomz.domain;

import java.util.Date;

/**
 * Created by Gerard on 5/01/15.
 */
public class Payment {
  private final String id;
  private final Date paid;
  private double total;

  public Payment(String id, Date paid) {
    this.id = id;
    this.paid = paid;
  }

  public String getId() {
    return id;
  }

  public Date getPaid() {
    return paid;
  }

  public double getTotal() {
    return total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

  @Override public String toString() {
    return "Payment{" +
            "id='" + id + '\'' +
            ", paid=" + paid +
            ", total=" + total +
            '}';
  }
}
