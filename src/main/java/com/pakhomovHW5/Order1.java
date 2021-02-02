package com.pakhomovHW5;

import java.util.Date;

public class Order1 {
    private double id;
    private Date date;
    private double customer;
    private String adress;

    public Order1(long id, long customer, String adress, Date date) {
        this.id = id;
        this.date = new Date(date.getTime());
        this.customer = customer;
        this.adress = adress;
    }

    public double getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public double getCustomer() {
        return customer;
    }

    public String getAdress() {
        return adress;

    }

    @Override
    public String toString() {
        return "User{" +
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

        Order1 order1 = (Order1) o;

        if (Double.compare(order1.id, id) != 0) return false;
        if (Double.compare(order1.customer, customer) != 0) return false;
        if (date != null ? !date.equals(order1.date) : order1.date != null) return false;
        return adress != null ? adress.equals(order1.adress) : order1.adress == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(id);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(customer);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }
}
