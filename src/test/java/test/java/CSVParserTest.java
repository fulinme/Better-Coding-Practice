package test.java;


import com.company.CSVParser;
import com.company.InfoDataModel;
import com.sun.tools.jdeprscan.CSV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

public class CSVParserTest {

    private final CSVParser parser = new CSVParser();

    @Test
    public void shouldParseOneCorrectLine()   {
        //Assertions.assertEquals(1, 2);
        final String line = "01-01-2021,-20,Grab";

        final InfoDataModel result = parser.ParseLine(line);

        final InfoDataModel expected = new InfoDataModel(LocalDate.of(2021, Month.JANUARY, 1), -20d, "Grab");

        Assertions.assertEquals(expected.getDate(), result.getDate());
        Assertions.assertEquals(expected.getAmount(), result.getAmount(), 0.0d);

    }

}
