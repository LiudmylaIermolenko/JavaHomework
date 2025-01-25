package org.asd._17_01_2025._Fib_Fac;

public class FibonacciSequence {
    private int length;

    public FibonacciSequence() {
        this.length = 0;
    }

    public FibonacciSequence(int length) {
        setLength(length);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0) {
            System.out.println("Mistake! Length cannot be negative.");
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public int[] getFibonacciFor() {
        if (length == 0) {
            return new int[0];
        }
        int[] array = new int[length];
        array[0] = 0;
        if (length > 1) array[1] = 1;
        for (int i = 2; i < length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array;
    }

    public int[] getFibonacciWhile() {
        if (length == 0) return new int[0];
        int[] array = new int[length];
        array[0] = 0;
        if (length > 1) array[1] = 1;
        int i = 2;
        while (i < length) {
            array[i] = array[i - 1] + array[i - 2];
            i++;
        }
        return array;
    }

    public int[] getFibonacciDoWhile() {
        if (length == 0) return new int[0];
        int[] array = new int[length];
        array[0] = 0;
        if (length > 1) array[1] = 1;
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
