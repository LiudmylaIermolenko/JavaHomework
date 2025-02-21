package org.asd._17_01_2025.D_Z_ArreyList_Overide;
//1.создать реализацию интерфейса List<E> для списка (ArrayList)с ограниченным размером.
// 2.Ограничение раз-ра задавать через конструктор.
// 3.Создать собственные классы исключений для фиксации попыток доб-я в заполненный
// список и попыток обращения к невалидному индексу.
// 4.Реализовать методы size, isEmpty, contains, iterator, add, remove, clear, get,
// set, add по индексу, remove по индексу, indexOf, lastIndexOf; toString.
// Разделяйте логику, если это возможно, можно создавать внутри реализации приватные
// методы, в которые выносить часть логики(пример: метод grow() при добавлении нового элемента

import java.util.*;

class ListFullException extends RuntimeException {
    public ListFullException(String message) {
        super(message);
    }
}

class InvalidIndexException extends RuntimeException {
    public InvalidIndexException(String message) {
        super(message);
    }
}

public class LimitedArrayList<E> implements List<E> {
    private Object[] elements;
    private int size = 0;
    private final int capacity;

//    public LimitedArrayList(int capacity, int size, Object[] elements) {
//        this.capacity = capacity;
//        this.size = size;
//        this.elements = elements;
//    }
    public LimitedArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.capacity = capacity;
        this.elements = new Object[capacity];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidIndexException("Invalid index: " + index);
        }
    }

    private void ensureNotFull() {
        if (size >= capacity) {
            throw new ListFullException("List is full. Cannot add more elements.");
        }
    }

    @Override
    public boolean add(E e) {
        ensureNotFull();
        elements[size] = e;
        size++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        ensureNotFull();
        checkIndex(index);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    @Override
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    @Override
    public E set(int index, E element) {
        checkIndex(index);
        E oldValue = (E) elements[index];
        elements[index] = element;
        return oldValue;
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E removedElement = (E) elements[index];
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null; // Убираем последний элемент
        return removedElement;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
            }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = size - 1; i >= 0; i--) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor < size;
            }

            @Override
            public E next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (E) elements[cursor++];
            }
        };
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elements, size));
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, size);
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }
}
