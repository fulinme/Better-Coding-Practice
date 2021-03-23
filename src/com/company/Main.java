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

        final Path path = Paths.get(txtCSV + args[0]);
        final List<String> lines = Files.readAllLines(path);
        double total = 0d;
        double totalInJaunary = 0;

        final DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for(final String line: lines) {
            final String[] columns = line.split(",");
            final double amount = Double.parseDouble(columns[1]);
            total += amount;

            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            if (date.getMonth() == Month.JANUARY) {
                final double amountInJanuary = Double.parseDouble(columns[1]);
                totalInJaunary += amountInJanuary;
            }
        }
        System.out.println("total transations is:" + total);
        System.out.println("total transations is January:" + totalInJaunary);

    }
}
