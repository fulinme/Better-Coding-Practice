package com.company;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class StatementProcessor {

    private final List<InfoDataModel> data;

    public StatementProcessor(final List<InfoDataModel> data) {
        this.data = data;
    }

    public double calcaulateTotalAmount() {
        double total = 0d;
        for (InfoDataModel dateItem : data) {
            total += dateItem.getAmount();
        }
        return total;
    }

    public  List<InfoDataModel> selectInMonth(final Month month) {
        final List<InfoDataModel> dataInMonth = new ArrayList<>();
        for(final InfoDataModel infoDataModel: data) {
            if (infoDataModel.getDate().getMonth() == month) {
                dataInMonth.add(infoDataModel);
            }
        }
        return dataInMonth;
    }


}
