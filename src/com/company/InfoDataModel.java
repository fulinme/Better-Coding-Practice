package com.company;

import java.time.LocalDate;

public class InfoDataModel {
    LocalDate date;
    Double spend;
    String company;

    InfoDataModel(LocalDate date, Double spend, String company) {
        this.date = date;
        this.spend = spend;
        this.company = company;
    }

}
