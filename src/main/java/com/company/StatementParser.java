package com.company;

import java.io.IOException;
import java.util.List;

public interface StatementParser {
    public List<InfoDataModel> Parse(String file) throws IOException;
    public InfoDataModel ParseLine(final String line);


}
