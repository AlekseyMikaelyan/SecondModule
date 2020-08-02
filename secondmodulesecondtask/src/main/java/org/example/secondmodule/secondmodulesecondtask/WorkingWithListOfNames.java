package org.example.secondmodule.secondmodulesecondtask;

import java.util.*;

public class WorkingWithListOfNames {

    public static String findFirstUniqueElement(List<String> list) {
        List<String> listOfUniqueNames = new ArrayList<>();

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String s : list) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for(Map.Entry<String, Integer> pair : map.entrySet()) {
            if(pair.getValue() == 1) {
                listOfUniqueNames.add(pair.getKey());
            }
        }
        return listOfUniqueNames.get(0);
    }

    public static List<String> creatingListOfNames() {
        List<String> list = new ArrayList<>();
        list.add("Masha");
        list.add("Alex");
        list.add("Masha");
        list.add("Sasha");
        list.add("George");
        list.add("Kevin");
        list.add("Sasha");
        list.add("Misha");
        list.add("Alex");
        list.add("Steven");
        list.add("Arnold");
        list.add("Mike");
        list.add("Will");
        list.add("Smith");
        list.add("Will");

        return list;
    }
}
