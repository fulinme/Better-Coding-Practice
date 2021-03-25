package com.company;

import java.io.IOException;
import java.util.List;

public class DataAnalyzer {
    private static final String txtCSV = "./";

    public List<InfoDataModel> analyze(final String fileName, final StatementParser parser) throws IOException {
        List<InfoDataModel> data = parser.Parse(txtCSV + fileName);
        return data;
    }


}
