package org.asd._17_01_2025;

import java.util.Arrays;

public class Massive {
    public static void main(String[] args) {

        int[] array = {3, -7, 2, 8, -10, 5, -6, 4};
        //int[] array2 = {};
        double average = getAverage(array);
        int[] smallest = findTwoMin(array);

//        System.out.println("1.Максимальный элемент: " + findMax(array));
//        System.out.println("2.Максимальный элемент с четным индексом: " + findMaxPlusIndex(array));
//        System.out.println("3.Cуммa четных положительных элементов: " + getEvenSum(array));
//        System.out.println("4.среднее арифметическое (int): " + getAverage(array));
//        System.out.println("4.среднее арифметическое (double): " + getAverage(array));2-й вар-т
        //Чтобы правильно вывести содержимое массива, нужно использовать Arrays.toString()
//        System.out.println("5.Элементы меньше сред. арифм.: " + Arrays.toString(getMinAverage(array,average)));
//        System.out.println("6.Сумма модулей элементов массива: " + getsumOfModul(array));
//        System.out.println("7.Номер минимального по модулю элемента: " + getInexMinModul(array));
        System.out.println("8.Два наименьших элемента: " + Arrays.toString(findTwoMin(array)));
        System.out.println("8.Минимальные элементы: " + smallest[0] + ", " + smallest[1]);//2-й вар-т

    }


    // 1. Найти максимальный элемент массива
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //2.В массиве найти максимальный элемент с четным индексом
    public static int findMaxPlusIndex(int[] array) {
        int max = array[0];
        for (int i = 2; i < array.length; i += 2) {
            //if (i % 2 == 0 && array[i]>max)
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //3.В массиве, содержащем положительные и отрицательные целые числа,
    //вычислить сумму четных положительных элементов
    public static int getEvenSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }

    //4.Найти среднее арифметическое от всех элементов массива

    //    public static int getAverage(int[] array) {//результат - целое число(округление вниз):
    public static double getAverage(int[] array) {//результат нужно возвращать как double
        if (array.length == 0) {
            System.out.println("Деление на ноль невозможно");//int[] array2 = {};
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
//        for (int j : array) {
//            sum += j;
//        }
//        return sum / array.length; // Округление вниз до целого числа
        return (double) sum / array.length; // Приведение суммы к double для дробного результата
    }

    //5.Найти в массиве те элементы, значение которых меньше среднего арифметического,

    public static int[] getMinAverage(int[] array, double average) {//target как 2-й арг-т
//    public static int[] getMinAverage(int[] array) {
//        double target = getAverage(array);// Получаем среднее арифм.

        int count = 0;
        // Считаем количество элементов, которые меньше среднего арифм
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                count++;
            }
        }
        // Создаем массив/Заполняем элементами, которые меньше среднего арифм
        int[] minArray = new int[count];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                minArray[index++] = array[i];//текущее значение index=0, а затем увелич его на 1
            }
        }
        return minArray;
    }

    //6.Вычислить сумму модулей элементов массива  (для вычисления модуля используйте Math.abs() )
    public static int getsumOfModul(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += Math.abs(array[i]);
        }
        return sum;
    }

    //7.Найти номер минимального по модулю элемента массива
    public static int getInexMinModul(int[] array) {
        int index = 0;
        int minModul = Math.abs(array[0]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minModul) {
                minModul = array[i];
                index = i;
            }
        }
        return index;
    }

    //8.В массиве целых чисел определить два наименьших элемента. Они могут быть как равны
//между собой (оба являться минимальными), так и различаться

    public static int[] findTwoMin(int[] array) {
        int min1 = 0;//Integer.MAX_VALUE;
        int min2 = 0;//Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min1) {
                min2 = min1;  // Второй минимальный становится первым минимальным
                min1 = array[i];  // Обновляем первый минимальный
            } else if (array[i] < min2) {
                min2 = array[i];// Обновляем второй мин-ый, если элемент больше первого мин-го
            }
        }
//        for (int j : array) {
//            if (j < min1) {
//                min2 = min1;
//                min1 = j;
//            } else if (j < min2) {
//                min2 = j;
//            }
//        }
        return new int[]{min1, min2};
    }
}


