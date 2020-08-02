package org.example.secondmodule.secondmodulesecondtask;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithListOfNamesTest {

    @Test
    public void methodShouldReturnCorrectName() {
        List<String> list = new ArrayList<>();
        list.add("Masha");
        list.add("Alex");
        list.add("Masha");
        list.add("Sasha");
        Assert.assertEquals("Alex", WorkingWithListOfNames.findFirstUniqueElement(list));
    }
}
