package org.asd.HomeWork_Pract;

public class MaxMinApp {
    //Реализовать два данных метода
//Написать на эти методы тесты!!!
    public static void main(String[] args) {
        ArrayFinder arrayFinder = new ArrayFinder();
        int[] array = {-4, 4, 2, 56, 42, 78, 33, 15, -1, -8, 15};
        int[] array1 = {4, 4, 2, 56, 142, 78, 33, 15, 1, 8, 15};
        int[] array2 = {-4, -4, -2, -56, -42, -78, -33, -15, -1, -8, -15};
        int[] array3 = {};
        int[] array4 = null;

        int min = arrayFinder.getMin(array);
        int max = arrayFinder.getMax(array);
        int maxPos = arrayFinder.getMaxPositive(array);
        int maxNeg = arrayFinder.getMinNegative(array);

        System.out.println("Min element " + arrayFinder.getMin(array));
        System.out.println("Max element " + arrayFinder.getMax(array));
        System.out.println("Max element " + arrayFinder.getMaxPositive(array1));
        System.out.println("Min element " + arrayFinder.getMinNegative(array2));
        //System.out.println("Min element " + arrayFinder.getMin(array3));
        //System.out.println("Min element " + arrayFinder.getMin(null));

    }
}
