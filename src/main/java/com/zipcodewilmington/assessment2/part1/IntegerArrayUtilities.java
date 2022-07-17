package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return (array.length % 2 == 0) ;
    }

    public Integer[] range(int start, int stop) {

        Integer[] range = new Integer[Math.abs(start - stop)+1];
        for (int i = 0; i < range.length; i++) {
            range[i] = start;
            start++;
        }
        return range;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        return array[array.length-2] * array[array.length-1];
    }
}
