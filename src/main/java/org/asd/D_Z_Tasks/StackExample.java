package org.asd.D_Z_Tasks;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        String str = "Hello, Java!";
        String reversedString = getReversedString(str);
        System.out.println(reversedString);
    }

    private static String getReversedString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());

        }
        return stringBuilder.toString();
    }
}

