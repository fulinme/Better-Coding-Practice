package com.company;

import java.time.LocalDate;

public class InfoDataModel {
    private final LocalDate date;
    private final Double amount;
    private final String company;

    InfoDataModel(LocalDate date, Double amount, String company) {
        this.date = date;
        this.amount = amount;
        this.company = company;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }



}
