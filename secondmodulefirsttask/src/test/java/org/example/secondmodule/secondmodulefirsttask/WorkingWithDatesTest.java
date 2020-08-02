package org.example.secondmodule.secondmodulefirsttask;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithDatesTest {

    @Test
    public void methodShouldReturnCorrectElement() {

        List<String> dates = new ArrayList<>();
        dates.add("2000/05/15");
        dates.add("03-15-2020");
        dates.add("18/10/2007");

        List<String> correctDates = WorkingWithDates.creatingNewListOfDates(dates);
        Assert.assertTrue(correctDates.get(0).equals("20000515"));

    }

    @Test
    public void methodShouldReturnCorrectList() {
        List<String> dates = new ArrayList<>();
        dates.add("2000/05/15");
        dates.add("03-15-2020");
        dates.add("18/10/2007");

        List<String> newDates = new ArrayList<>();
        newDates.add("20000515");
        newDates.add("20200315");
        newDates.add("20071018");

        List<String> correctDates = WorkingWithDates.creatingNewListOfDates(dates);

        Assert.assertEquals(newDates, correctDates);

    }
}
