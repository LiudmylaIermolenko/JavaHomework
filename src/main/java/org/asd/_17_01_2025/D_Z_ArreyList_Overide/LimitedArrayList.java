package org.asd._17_01_2025.D_Z_ArreyList_Overide;
//1.создать реализацию интерфейса List<E> для списка (ArrayList)с ограниченным размером.
// 2.Ограничение раз-ра задавать через конструктор.
// 3.Создать собственные классы исключений для фиксации попыток доб-я в заполненный
// список и попыток обращения к невалидному индексу.
// 4.Реализовать методы size, isEmpty, contains, iterator, add, remove, clear, get,
// set, add по индексу, remove по индексу, indexOf, lastIndexOf; toString.
// Разделяйте логику, если это возможно, можно создавать внутри реализации приватные
// методы, в которые выносить часть логики(пример: метод grow() при добавлении нового элемента
//В задании требуется реализовать и протестировать следующие методы:
//
//        size()
//        isEmpty()
//        contains(Object o)
//        iterator()
//        add(E e)
//        add(int index, E element)
//        remove(int index)
//        remove(Object o)
//        clear()
//        get(int index)
//        set(int index, E element)
//        indexOf(Object o)
//        lastIndexOf(Object o)
//        toString()
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
    private int maxSize;
    private static final int DEFAULT_CAPACITY = 10;

    public LimitedArrayList(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size must be greater than zero.");
        }
        this.maxSize = maxSize;
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new InvalidIndexException("Invalid index: " + index);
        }
    }

    private Object[] grow(){
        Object[] newArr = new Object[elements.length * 3/2];
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        return  newArr;
    }


    private void ensureNotFull() {
        if (size >= maxSize) {
            throw new ListFullException("List is full. Cannot add more elements.");
        }
    }

    @Override
    public boolean add(E e) {
       add(size, e);
       return true;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new InvalidIndexException("Invalid index: " + index);
        }
        ensureNotFull();
        if (size == elements.length) {
            elements = grow();
        }
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
        elements[--size] = null;
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

//написать тесты
//Проверить разные случаи: например  работу
// с null для реализации листа,
// проверить выбрасывание исключений если имеются.
//метод add для своей реализации листа протестируйте следующим образом (на скрине), метод equals переопределять не нужно. в тестах следите что бы в expected находилась какая то библиотечная реализация листа (прим. List.of или new ArrayList, а не  MyArrayList !), а в actual уже будет ваш MyArrayList.
//Тестирование своей реализации листа остаётся в силе)