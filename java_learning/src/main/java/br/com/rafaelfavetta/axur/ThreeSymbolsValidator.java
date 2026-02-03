package br.com.rafaelfavetta.axur;

import java.util.ArrayDeque;
import java.util.Deque;

public class ThreeSymbolsValidator {
    public static void main(String[] args) {

        String input = "{[}}";

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if (c == ')' || c == ']' || c == '}'){
                if (stack.isEmpty()){
                    System.out.println("Invalid");
                    return;
                }

                char opening = stack.pop();

                if (c == ')' && opening != '('){
                    System.out.println("Invalid");
                    return;
                }
                if (c == ']' && opening != '['){
                    System.out.println("Invalid");
                    return;
                }
                if (c == '}' && opening != '{'){
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("Invalid");
            return;
        }
        System.out.println("Valid");
    }
}
