package org.asd._17_01_2025.D_Z_ArreyList_Overide;

import java.util.Map;
import java.util.TreeMap;

/**
 * Программа принимает на вход текст, произвольной длины, обрабатывает его и выводит все слова, которые встречаются в тексте (без дубликатов) группируя их по первой букве в алфавитном порядке.
 * Знаки препинания, кавычки, скобки (кроме апострофа) игнорируются, числа также игнорируются.
 * Регистр заглавных букв не учитывается. Подсчитать количество вхождений.
 */
public class Format {
    public static void main(String[] args) {
        String text = "Once upon a time a Wolf was lapping at a spring on a hillside, when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";

        Map<Character, Map<String, Integer>> groupedWords = processText(text);
        printGroupedWords(groupedWords);
    }

    public static Map<Character, Map<String, Integer>> processText(String text) {
        text = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-ЯёЁ'\\s]", "");

        String[] words = text.split("\\s+");

        Map<Character, Map<String, Integer>> wordGroups = new TreeMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = word.charAt(0);

                wordGroups.putIfAbsent(firstLetter, new TreeMap<>());
                Map<String, Integer> wordCounts = wordGroups.get(firstLetter);
                wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
            }
        }
        return wordGroups;
    }
    public static void printGroupedWords(Map<Character, Map<String, Integer>> groupedWords) {
        for (Map.Entry<Character, Map<String, Integer>> entry : groupedWords.entrySet()) {
            char firstLetter = entry.getKey();
            Map<String, Integer> words = entry.getValue();
            System.out.println(firstLetter + ":");

            for (Map.Entry<String, Integer> wordEntry : words.entrySet()) {
                System.out.println("   " + wordEntry.getKey() + " " + wordEntry.getValue());
            }
        }
    }
}


