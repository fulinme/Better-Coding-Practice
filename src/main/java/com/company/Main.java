package com.company;

import java.io.IOException;
import java.time.Month;
import java.util.List;

public class Main {


    public static void main(String[] args) throws IOException {


        List<InfoDataModel> data = new DataAnalyzer().analyze(args[0], new CSVParser());

        StatementProcessor dataProcess = new StatementProcessor(data);

        System.out.println("total transations is:" + dataProcess.calcaulateTotalAmount());

        double totalInJaunary = (new StatementProcessor(dataProcess.selectInMonth(Month.JANUARY))).calcaulateTotalAmount();
        System.out.println("total transations is January:" + totalInJaunary);

    }







}
