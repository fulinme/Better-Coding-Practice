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

        StatementProcessor dataProcess = new StatementProcessor(data);

        System.out.println("total transations is:" + dataProcess.calcaulateTotalAmount());

        double totalInJaunary = (new StatementProcessor(dataProcess.selectInMonth(Month.JANUARY))).calcaulateTotalAmount();
        System.out.println("total transations is January:" + totalInJaunary);

    }




}
