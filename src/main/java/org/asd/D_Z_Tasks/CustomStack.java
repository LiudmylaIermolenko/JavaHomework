package org.asd.D_Z_Tasks;
//На основе библиотечного класса LinkedList реализовать такую структуру данных,
// как стек: Создать класс CustomStack с методами push(), pop(), peek().
// Протестировать работу класса.

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

public class CustomStack <T>{

    private LinkedList <T> data = new LinkedList<>();//Использует LinkedList в качестве внутреннего хранилища

    public void push(T element){//Добавляет элемент в начало списка (вершину стека).
        data.addFirst(element);
    }

    public T pop(){ //Удаляет и возвращает верхний элемент стека.
        if (data.isEmpty())
            throw new NoSuchElementException();
        return data.pop();
    }

    public T peek(){ //Возвращает верхний элемент стека, но не удаляет его.
        if (data.isEmpty())
            throw new NoSuchElementException();
        return data.peek();
    }

    @Override
    public String toString() {
        return "CustomStack{" + "data" + data + "}";
    }

    public static void main(String[] args) {
        CustomStack<java.lang.String> stringCustomStack = new CustomStack<>();
        stringCustomStack.push("Hello");
        stringCustomStack.push("Hi!");
        stringCustomStack.push("Goodbye");
        System.out.println("stringCustomStack = " + stringCustomStack);
        System.out.println("stringCustomStack.pop() = " + stringCustomStack.pop());
        System.out.println("stringCustomStack = " + stringCustomStack);
        System.out.println("stringCustomStack.peek() = " + stringCustomStack.peek());
        System.out.println("stringCustomStack = " + stringCustomStack);
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Bye");
        stack.push("Hi!");
        System.out.println("stack = " + stack);
    }
}
//На основе библиотечного класса LinkedList реализовать такую структуру
// данных, как стек: Создать класс CustomStack
// с методами push(), pop(), peek(). Протестировать работу класса.

