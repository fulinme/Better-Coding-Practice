package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    private static final String txtCSV = "./";

    public static void main(String[] args) throws IOException {
        double total = 0d;
        double totalInJaunary = 0;
        List<InfoDataModel> data = new CSVParser().CSVParse(txtCSV + args[0]);

        for (InfoDataModel dateItem : data) {
            total += dateItem.spend;

            if (dateItem.date.getMonth() == Month.JANUARY) {
                totalInJaunary += dateItem.spend;
            }
        }

        System.out.println("total transations is:" + total);
        System.out.println("total transations is January:" + totalInJaunary);

    }
}
