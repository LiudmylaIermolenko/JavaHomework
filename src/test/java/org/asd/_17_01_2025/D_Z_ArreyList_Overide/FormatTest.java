package org.asd._17_01_2025.D_Z_ArreyList_Overide;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FormatTest {

    // Тест на основной пример
    @Test
    void testFormatText() {
        String text = "Once upon a time a Wolf was lapping at a spring on a hillside, " +
                "when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";

        String result = Format.formatText(text);

        String expected = "A:\n" +
                "   a 6\n" +
                "   at 1\n" +
                "B:\n" +
                "   beginning 1\n" +
                "   but 1\n" +
                "D:\n" +
                "   down 1\n" +
                "   drink 1\n" +
                "H:\n" +
                "   he 1\n" +
                "   hillside 1\n" +
                "J:\n" +
                "   just 1\n" +
                "L:\n" +
                "   lamb 1\n" +
                "   lapping 1\n" +
                "   little 1\n" +
                "   looking 1\n" +
                "   lower 1\n" +
                "O:\n" +
                "   on 1\n" +
                "   once 1\n" +
                "S:\n" +
                "   see 1\n" +
                "   should 1\n" +
                "   spring 1\n" +
                "T:\n" +
                "   time 1\n" +
                "   to 1\n" +
                "U:\n" +
                "   up 1\n" +
                "   upon 1\n" +
                "W:\n" +
                "   was 1\n" +
                "   what 1\n" +
                "   when 1\n" +
                "   wolf 1\n";

        //System.out.println("EXPECTED:\n" + expected);
        //System.out.println("ACTUAL RESULT:\n" + result);
        assertEquals(expected, result);
    }

    // Тест на текст с цифрами и знаками препинания
    @Test
    void testTextWithPunctuationAndNumbers() {
        String text = "Hello, world! My phone number is 1234567890. Call me!!!";

        String result = Format.formatText(text);

        String expected = "C:\n" +
                "   call 1\n" +
                "H:\n" +
                "   hello 1\n" +
                "I:\n" +
                "   is 1\n" +
                "M:\n" +
                "   me 1\n" +
                "   my 1\n" +
                "N:\n" +
                "   number 1\n" +
                "P:\n" +
                "   phone 1\n" +
                "W:\n" +
                "   world 1\n";
        //System.out.println("EXPECTED:\n" + expected);
        //System.out.println("ACTUAL RESULT:\n" + result);
        assertEquals(expected, result);
    }

    // Тест на пустой текст
    @Test
    void testEmptyText() {
        String text = "";

        String result = Format.formatText(text);

        assertEquals("", result);
    }

    // Тест на текст на русском языке
    @Test
    void testTextInRussian() {
        String text = "Как дела? Все хорошо, всё отлично.";

        String result = Format.formatText(text);

        String expected = "В:\n" +
                "   все 1\n" +
                "   всё 1\n" +
                "Д:\n" +
                "   дела 1\n" +
                "К:\n" +
                "   как 1\n" +
                "О:\n" +
                "   отлично 1\n" +
                "Х:\n" +
                "   хорошо 1\n";
        System.out.println("EXPECTED:\n" + expected);
        System.out.println("ACTUAL RESULT:\n" + result);

        assertEquals(expected, result);
    }

    // Тест на текст с одинаковыми словами
    @Test
    void testTextWithRepeatingWords() {
        String text = "Hello hello hello world world!";

        String result = Format.formatText(text);

        String expected = "H:\n" +
                "   hello 3\n" +
                "W:\n" +
                "   world 2\n";

        assertEquals(expected, result);
    }

}
