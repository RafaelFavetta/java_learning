package br.com.rafaelfavetta.axur;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesesValidator {
    public static void main(String[] args) {

        String input = "((()())))";

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '('){
                stack.push(c);
                continue;
            }
            if (c == ')'){
                if (stack.isEmpty()){
                    System.out.println("Invalid");
                    return;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()){
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");
    }
}
