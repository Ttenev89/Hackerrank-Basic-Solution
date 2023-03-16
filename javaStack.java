package com.company;

import java.util.Scanner;
import java.util.Stack;

public class javaStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(isBalanced(scanner.next()));
        }
        scanner.close();
    }

    static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
                        || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
