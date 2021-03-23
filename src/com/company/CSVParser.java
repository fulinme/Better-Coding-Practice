package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CSVParser {
    private final static DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    static List<InfoDataModel> CSVParse(String file) throws IOException {

        List<InfoDataModel> result = new ArrayList<>();

        final Path path = Paths.get(file);
        final List<String> lines = Files.readAllLines(path);

        for (final String line : lines) {
            final String[] columns = line.split(",");
            final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
            final double amount = Double.parseDouble(columns[1]);
            final String company = columns[2];

            InfoDataModel tmp = new InfoDataModel(date, amount, company);
            result.add(tmp);
        }
        return result;
    }


}
