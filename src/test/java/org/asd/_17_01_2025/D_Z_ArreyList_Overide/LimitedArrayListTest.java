package org.asd._17_01_2025.D_Z_ArreyList_Overide;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LimitedArrayListTest {
    private LimitedArrayList<String> list;

    @BeforeEach
    void setUp() {
        list = new LimitedArrayList<>(5);
    }

    @Test
    void addTestElement() {
        List<Integer> expected = List.of(0);
        List<Integer> list = new LimitedArrayList<>(15);

        list.add(0);
        Assertions.assertEquals(expected.size(), list.size());
        Assertions.assertEquals(expected.get(0), list.get(0));
    }

    @Test
    void addByIndexTest() {
        List<Integer> expected = List.of(10, 0, 20);
        List<Integer> list = new LimitedArrayList<>(15);

        list.add(0, 0);
        list.add(0, 10);
        list.add(2, 20);

        Assertions.assertEquals(expected.size(), list.size());
        Assertions.assertEquals(expected.get(0), list.get(0));
        Assertions.assertEquals(expected.get(1), list.get(1));
        Assertions.assertEquals(expected.get(2), list.get(2));
    }

    @Test
    void testAddElementWhenFull() {
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        assertThrows(ListFullException.class, () -> list.add("6"));
    }

    @Test
    void testAddElementAtInvalidIndex() {
        list.add("1");
        assertThrows(InvalidIndexException.class, () -> list.add(2, "2"));
    }

    @Test
    void testAddNullElement() {
        list.add(null);
        List<String> expected = new ArrayList<>();
        expected.add(null);
        List<String> actual = new ArrayList<>();
        actual.add(list.get(0));
        assertEquals(expected, actual);
    }

    @Test
    void testGetElement() {
        list.add("1");
        String actual = list.get(0);
        String expected = "1";
        assertEquals(expected, actual);
    }

    @Test
    void testSetElement() {
        list.add("1");
        list.set(0, "2");

        List<String> expected = List.of("2");
        List<String> actual = new ArrayList<>();
        actual.add(list.get(0));
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveByIndex() {
        list.add("1");
        list.add("2");
        list.remove(0);

        List<String> expected = List.of("2");
        List<String> actual = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            actual.add(list.get(i));
        }
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveByObject() {
        list.add("1");
        list.add("2");
        list.remove("1");

        List<String> expected = List.of("2");
        List<String> actual = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            actual.add(list.get(i));
        }
        assertEquals(expected, actual);
    }

    @Test
    void testRemoveByIndexWithInvalidIndex() {
        list.add("1");
        assertThrows(InvalidIndexException.class, () -> list.remove(1));
    }

    @Test
    void testClear() {
        list.add("1");
        list.add("2");
        list.clear();
        assertEquals(0, list.size());
    }
    //List<Integer> list = new LimitedArrayList<>(10);
    //        list.add(1);
    //        list.add(2);
    //        list.clear();
    //
    //        Assertions.assertTrue(list.isEmpty());
    //        Assertions.assertEquals(0, list.size());
    //    }

    @Test
    void size() {
        //assertEquals(ожидаемое_значение, фактическое_значение, сообщение_об_ошибке);
        assertEquals(0, list.size(), "Список должен быть пустым изначально");

        list.add("element1");
        assertEquals(1, list.size(), "После добавления одного элемента размер должен быть 1");

        list.add("element2");
        assertEquals(2, list.size(), "После добавления второго элемента размер должен быть 2");

        list.remove("element1");
        assertEquals(1, list.size(), "После удаления одного элемента размер должен быть 1");

        list.clear(); // Очищаем список
        assertEquals(0, list.size(), "После очистки списка его размер должен быть 0");
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty(), "Список должен быть пустым изначально");

        list.add("element1");
        assertFalse(list.isEmpty(), "После добавления одного элемента список не должен быть пустым");

        list.clear(); // Очищаем список
        assertTrue(list.isEmpty(), "После очистки списка он должен быть пустым");
    }

    @Test
    void testContains() {
        list.add("1");
        assertTrue(list.contains("1"));
        assertFalse(list.contains("2"));
    }
    //List<Integer> list = new LimitedArrayList<>(10);
    //        list.add(5);
    //        list.add(10);
    //        Assertions.assertTrue(list.contains(5));
    //        Assertions.assertFalse(list.contains(20));
    //    }

    @Test
    void testIndexOf() {
        list.add("apple");
        list.add("banana");
        list.add("apple");

        Assertions.assertEquals(0, list.indexOf("apple"));
        Assertions.assertEquals(-1, list.indexOf("orange"));
    }

    @Test
    void lastIndexOfTest() {
    List<String> list = new LimitedArrayList<>(10);
        list.add("apple");
        list.add("banana");
        list.add("apple");

        Assertions.assertEquals(2, list.lastIndexOf("apple"));
        Assertions.assertEquals(-1, list.lastIndexOf("orange"));
}

    @Test
    void iteratorTest() {
        List<Integer> expected = List.of(1, 2, 3);
        List<Integer> actual = new LimitedArrayList<>(10);

        actual.add(1);
        actual.add(2);
        actual.add(3);

        List<Integer> result = new ArrayList<>();
        Iterator<Integer> iterator = actual.iterator();
        while (iterator.hasNext()) {
            result.add(iterator.next());
        }
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testToString() {
        list.add("1");
        list.add("2");

        String expected = "[1, 2]";
        String actual = list.toString();

        assertEquals(expected, actual);
    }
    //List<Integer> list = new LimitedArrayList<>(10);
    //        list.add(1);
    //        list.add(2);
    //        list.add(3);
    //
    //        Assertions.assertEquals("[1, 2, 3]", list.toString());
    //    }
    //}



    @Test
    void listIterator() {
    }

    @Test
    void testListIterator() {
    }

    @Test
    void subList() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testToArray() {
    }

    @Test
    void containsAll() {
    }

    @Test
    void addAll() {
    }

    @Test
    void testAddAll() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }
}