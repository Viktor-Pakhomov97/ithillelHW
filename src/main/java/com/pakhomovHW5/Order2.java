package com.pakhomovHW5;

import java.util.Date;


public class Order2 {
    double id;
    Date date;
    double customer;
    String adress;

    public Order2(long id, long customer, String adress, Date date) {
        this.id = id;
        this.date = new Date(date.getTime());
        this.customer = customer;
        this.adress = adress;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getCustomer() {
        return customer;
    }

    public void setCustomer(double customer) {
        this.customer = customer;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "order2{" +
                "id=" + id +
                ", date=" + date +
                ", customer=" + customer +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order2 order2 = (Order2) o;

        if (Double.compare(order2.id, id) != 0) return false;
        if (Double.compare(order2.customer, customer) != 0) return false;
        if (date != null ? !date.equals(order2.date) : order2.date != null) return false;
        return adress != null ? adress.equals(order2.adress) : order2.adress == null;
    }

    @Override
    public int hashCode() {
        int result;
        long  temp;
        temp = Double.doubleToLongBits(id);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(customer);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }
}

