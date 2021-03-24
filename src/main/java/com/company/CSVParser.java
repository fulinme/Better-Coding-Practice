package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class CSVParser implements StatementParser {
    private final static DateTimeFormatter DATE_PATTERN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

     public List<InfoDataModel> Parse(String file) throws IOException {
        List<InfoDataModel> result = new ArrayList<>();

        final Path path = Paths.get(file);
        final List<String> lines = Files.readAllLines(path);

        for (final String line : lines) {
            result.add(ParseLine(line));
        }
        return result;
    }

    public InfoDataModel ParseLine(final String line) {

        final String[] columns = line.split(",");
        final LocalDate date = LocalDate.parse(columns[0], DATE_PATTERN);
        final double amount = Double.parseDouble(columns[1]);
        final String company = columns[2];

        return new InfoDataModel(date, amount, company);
    }



}
