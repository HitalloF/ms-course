package com.devsuperior.hrpayroll.entities;


import java.io.Serializable;
import java.util.Objects;

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;
    private Double dailyIncome;
    private Integer days;

    public Payment(String bob, double v){
    }

    public Payment(String name, Double dailyIncome, Integer days) {
        this.name = name;
        this.dailyIncome = dailyIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDailyIncome(Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Payment payment = (Payment) o;
        return Objects.equals(name, payment.name) && Objects.equals(dailyIncome, payment.dailyIncome) && Objects.equals(days, payment.days);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dailyIncome, days);
    }
    public Double getTotal(){
        return days * dailyIncome;
    }
}
