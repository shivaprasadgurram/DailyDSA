package com.shivaprasad.may.revision.day124;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        System.out.println(isValid("({[({"));
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {

            if (stack.isEmpty() && (ch == '}' || ch == ']' || ch == ')')) {
                return false;
            }

            else if(!stack.isEmpty() && ( ch == '}' && stack.peek() == '{')) {
                stack.pop();
            }

            else if(!stack.isEmpty() && ( ch == ']' && stack.peek() == '[')) {
                stack.pop();
            }

            else if(!stack.isEmpty() && ( ch == ')' && stack.peek() == '(')) {
                stack.pop();
            }
            else
                stack.push(ch);
        }

        return stack.isEmpty();
    }
}
