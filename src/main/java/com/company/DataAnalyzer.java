package com.company;

import java.io.IOException;
import java.util.List;

public class DataAnalyzer {

    public List<InfoDataModel> analyze(final String fileName, final StatementParser parser) throws IOException {
        List<InfoDataModel> data = parser.Parse(fileName);
        return data;
    }


}
