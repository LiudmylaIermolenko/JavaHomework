package org.asd._17_01_2025;

public class FibonacciSequence {
 private int length;

    // Конструктор по умолчанию
    public FibonacciSequence(){
    }

    // Конструктор с параметром
    public FibonacciSequence(int length) {
        this.length = length;
    }
    // Геттер для длины
    public int getLength() {
        return length;
    }
    // Сеттер для длины с проверкой
    public void setLength(int length) {
        if (length<0){
            System.out.println("Mistake!");
        }
        this.length = length;
    }

    // Метод через цикл for
    public int[] getFibonacciFor() {
        int[] array = new int[length];

        // Инициализация первых двух элементов
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    // Метод через цикл while
    public int[] getFibonacciWhile() {
        int[] array = new int[length];

        // Инициализация первых двух элементов
        array[0] = 0;
        array[1] = 1;
        int i = 2;
        while (i < length) {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        }
        return array;
    }

    // Метод через цикл do-while
    public int[] getFibonacciDoWhile() {
        int[] array = new int[length];

        // Инициализация первых двух элементов
        array[0] = 0;
        array[1] = 1;
        int i = 2;
        do {
            if (i >= length) break;
            array[i] = array[i - 1] + array[i - 2];
            i++;
        } while (i < length);

        return array;
    }
}



//Написать класс FibonacciSequence, в котором есть поле length - длинна
// последовательности Фибоначчи.
//Написать 3 метода в этом классе, возвращающих последовательность
// фибоначчи размера length в виде массива. Пример [0, 1, 1, 2, 3, 5]
// для length = 6.
//Каждый метод использует свой вариант цикла: 1 метод через цикл for,
// 2 через while, 3 через do-while.
//Написать конструктор с параметром и без параметров для этого класса.
// Не допускать возможность установки отрицательного значения length.
//
//Написать программу (отдельный класс с методом main) в котором создать
// объект класса FibonacciSequence и протестировать работу всех получившихся методов.
