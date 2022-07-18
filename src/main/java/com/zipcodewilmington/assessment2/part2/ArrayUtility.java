package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] mergeArray = new Integer[array1.length + array2.length];

        int mergeArrayIndex = 0;

        for (int i = 0; i < array1.length; i++) {
            mergeArray[mergeArrayIndex] = array1[i];
            mergeArrayIndex++;
        }

        for (int i = 0; i < array2.length; i++) {
            mergeArray[mergeArrayIndex] = array2[i];
            mergeArrayIndex++;
        }

        return mergeArray;

//        ArrayList<Integer> list = new ArrayList<>();
//        list.addAll(Arrays.asList(array1));
//        list.addAll(Arrays.asList(array2));
//        return list.toArray(new Integer[0]);
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        Integer[] rotateArray = new Integer[array.length];
        Integer rotateArrayIndex = 0;

        for (int i = index; i < array.length; i++) {
            rotateArray[rotateArrayIndex] = array[i];
            rotateArrayIndex++;
        }
        for (int i = 0; i < index; i++) {
            rotateArray[rotateArrayIndex] = array[i];
            rotateArrayIndex++;
        }

        return rotateArray;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

//        Integer counter = 0;
//
//        for (int i = 0; i < array1.length; i++) {
//            if (array1[i] == valueToEvaluate) {
//                counter++;
//            }
//        }
//        for (int i = 0; i < array2.length; i++) {
//            if (array2[i] == valueToEvaluate) {
//                counter++;
//            }
//        }
//        return counter;

        Integer[] merged = merge(array1, array2);
        Integer counter = 0;

        for (int i = 0; i < merged.length; i++) {
            if (merged[i] == valueToEvaluate) {
                counter++;
            }
        }
        return counter;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
