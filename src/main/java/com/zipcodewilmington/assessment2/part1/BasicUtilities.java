package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {
        return value >= 5;
    }

    public Boolean isLessThan7(Integer value) {
        return value <= 7;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {
        return 5 <= valueToEvaluate && valueToEvaluate <= 7;
    }

    public Boolean startsWith(String string, Character character) {
        char a = string.charAt(0);
        return character.toString().equalsIgnoreCase(Character.toString(a));
    }
}
