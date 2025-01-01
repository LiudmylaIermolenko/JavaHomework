package org.asd.Summary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArraysMain {
    public static void main(String[] args) {
        int[] a = new int[10];
        int b[] = new int[10];
        int[] c = {1,8,4,9,3}; //new int[5]

        System.out.println(Arrays.toString(a)); //распечатать содержимое массива

        boolean[] bool = new boolean[10];
        System.out.println(Arrays.toString(bool)); //распечатать содержимое массива

        String[] strings = new String[10];
        System.out.println(Arrays.toString(strings)); //распечатать содержимое массива

        Integer intObj; //объявление переменной ссылочного типа
        intObj = 10;
        Integer[] aObj; //объявление переменной массива элементов ссылочного типа
        aObj = new Integer[10];
        System.out.println("aObj = "+Arrays.toString(aObj)); //распечатать содержимое массива
        aObj[1] = 5;
        System.out.println("aObj = "+Arrays.toString(aObj)); //распечатать содержимое массива

        a[1] = 5; //присвоение
        System.out.println(a[1]); //доступ
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10);
        }
        System.out.println("a[] = "+Arrays.toString(a)); //распечатать содержимое массива

        //a[10] = 25; // выход за пределы массива

        //удаляем элемент
        a[1] = 0; // для примитивного типа значение по default
        aObj[1] = null; // для ссылочного типа

        // Java
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1,8,4,9,3,6,3,8,9,9));
        arrayList.remove(2);

        Object[] arr = arrayList.toArray();
        System.out.println("arr="+arr.length);

        Integer[] arrInt = new Integer[10];
        arrayList.toArray(arrInt);
        System.out.println("arrInt="+arrInt.length);
        System.out.println("arrInt = "+Arrays.toString(arrInt)); //распечатать содержимое массива

        // Сортировка
        int[] sortArr = sortBubble(a);
        System.out.println("отсортированный a[] (While) -> "+Arrays.toString(sortArr));

        int[] sortArrFor = sortBubbleFor(a);
        System.out.println("отсортированный a[] (For) -> "+Arrays.toString(sortArrFor));

        // поиск в массиве Reverse
        //System.out.println(findElement+" есть ли в массиве a[] (reverse) -> "+existNumberReverse(a, findElement));


        System.out.println("отсортированный a[] (убывание значений) -> "+Arrays.toString(sortBubbleDesc(a)));
    }

    //Metod sortirowki:

    static  boolean existNumber(int[] arr, int source) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == source) {
                return true;//source jest
            }
        }
        return  false;//source net
    }

    //bubble method
    static int[] sortBubble(int[] arr) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) { //for(;!isSorted;)
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
             if(arr[i]>arr[i+1])  {
                 tmp = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = tmp;
                 isSorted = false;
             }
            }
        }
        return  arr;
    }

    //сортировка Пузырьком For
    static int[] sortBubbleFor(int[] arr) {
        boolean isSorted = false;
        for(int tmp=-1;!isSorted;) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }


    // поиск обратный
    static boolean existNumberReverse(int[] arr, int source) {
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == source) {
                return true; //элемент найден
            }
        }
        return false; //элемент не найден
    }


    //сортировка Пузырьком
    static int[] sortBubbleDesc(int[] arr) {
        boolean isSorted = false;
        int tmp;
        while (!isSorted) { //for(;!isSorted;)
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] < arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }


}
