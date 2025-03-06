package org.asd.H_Work_04_03;

public class ArrayFinder {
    public int getMax(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int getMin(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым или null");
        }
        int min = array[0];
        for (int num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public int getMaxPositive(int[] array){
        int maxPositive = Integer.MIN_VALUE;
        boolean foundPositive = false;

        for (int num : array) {
            if (num > 0) {
                maxPositive = Math.max(maxPositive, num);
                foundPositive = true;
            }
        }
        if (!foundPositive) {
            throw new IllegalArgumentException("В массиве нет положительных чисел");
        }

        return maxPositive;
    }
    public int getMinNegative(int[] array){
        int minNegative = Integer.MAX_VALUE;
        boolean foundNegative = false;

        for (int num : array) {
            if (num < 0) {
                minNegative = Math.min(minNegative, num);
                foundNegative = true;
            }
        }
        if (!foundNegative) {
            throw new IllegalArgumentException("В массиве нет отрицательных чисел");
        }

        return minNegative;
    }
}

