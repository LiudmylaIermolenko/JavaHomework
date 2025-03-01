package org.asd._17_01_2025.D_Z_ArreyList_Overide;

import java.util.*;

/**
 * Программа принимает на вход текст, произвольной длины, обрабатывает его и выводит все слова, которые встречаются в тексте (без дубликатов)
 * группируя их по первой букве в алфавитном порядке.
 * Знаки препинания, кавычки, скобки (кроме апострофа) игнорируются, числа также игнорируются.
 * Регистр заглавных букв не учитывается. Подсчитать количество вхождений.
 */
public class Format {
    public static void main(String[] args) {
        String text = "Once upon a time a Wolf was lapping at a spring on a hillside, " +
                "when, looking up, what should he see but a Lamb just beginning to drink a little lower down.";

        String result = formatText(text);
        System.out.println(result);
    }

    public static String formatText(String text) {
        text = text.toLowerCase().replaceAll("[^a-zA-Zа-яА-Я'\\s]", ""); // Убираем знаки препинания и числа
        String[] words = text.split("\\s+");
        Map<Character, Map<String, Integer>> wordGroups = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                char firstLetter = word.charAt(0);
                if (!wordGroups.containsKey(firstLetter)) {
                    wordGroups.put(firstLetter, new HashMap<>());
                }
                Map<String, Integer> wordCounts = wordGroups.get(firstLetter);

                if (!wordCounts.containsKey(word)) {
                    wordCounts.put(word, 1);
                } else {
                    wordCounts.put(word, wordCounts.get(word) + 1);
                }
            }
        }
        return generateFormattedText(wordGroups);
    }


    public static String generateFormattedText(Map<Character, Map<String, Integer>> groupedWords) {
        StringBuilder result = new StringBuilder();

        List<Character> sortedKeys = new ArrayList<>(groupedWords.keySet());
        Collections.sort(sortedKeys); // Сортируем ключи (буквы) по алфавиту

        for (char firstLetter : sortedKeys) {
            result.append(Character.toUpperCase(firstLetter)).append(":\n");
            Map<String, Integer> words = groupedWords.get(firstLetter);

            List<String> sortedWords = new ArrayList<>(words.keySet());
            Collections.sort(sortedWords);

            for (String word : sortedWords) {
                result.append("   ").append(word).append(" ").append(words.get(word)).append("\n");
            }
        }

        return result.toString();
    }
}


