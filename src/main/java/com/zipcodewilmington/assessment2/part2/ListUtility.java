package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.*;

public class ListUtility {

    List<Integer> list = new ArrayList<>();

    public Boolean add(int i) {
        return list.add(i);
    }

    public Integer size() {
        return list.size();
    }

    public List<Integer> getUnique() {
        //set does not accept duplicate values.
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(list);

        List<Integer> unique = new LinkedList<>();
        unique.addAll(set);

        return unique;
    }

    public String join() {
        String a = list.toString();
        a = a.replaceAll("\\[", "");
        a = a.replaceAll("]", "");
        return a;
    }

    public Integer mostCommon() {
        Integer counter = 0;
        Integer mostCommon = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            Integer temp = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i) == list.get(j)) {
                    temp++;
                }
            }
            if (temp > counter) {
                counter = temp;
                mostCommon = list.get(i);
            }
        }

        return mostCommon;
    }

    public Boolean contains(Integer valueToAdd) {
        if (valueToAdd == null) {
            return false;
        }
        return list.contains(valueToAdd);
    }
}
