package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String txtCSV = "./";

    public static void main(String[] args) throws IOException {


        List<InfoDataModel> data = new CSVParser().CSVParse(txtCSV + args[0]);

        System.out.println("total transations is:" + calcaulateTotalAmount(data));

        double totalInJaunary = calcaulateTotalAmount(selectInMonth(data, Month.JANUARY));
        System.out.println("total transations is January:" + totalInJaunary);

    }

    public static double calcaulateTotalAmount(final List<InfoDataModel> data) {
        double total = 0d;
        for (InfoDataModel dateItem : data) {
            total += dateItem.getAmount();
        }
        return total;
    }

    public static  List<InfoDataModel> selectInMonth(final List<InfoDataModel> data, final Month month) {
        final List<InfoDataModel> dataInMonth = new ArrayList<>();
        for(final InfoDataModel infoDataModel: data) {
            if (infoDataModel.getDate().getMonth() == month) {
                dataInMonth.add(infoDataModel);
            }
        }
        return dataInMonth;
    }


}
