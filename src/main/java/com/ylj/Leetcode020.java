package com.ylj;

import java.util.Stack;

public class Leetcode020 {

    public static void main(String[] args) {
        isValid("()");
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            switch (c){
                case '(':
                case '[':
                case '{':
                   stack.push(c);
                   break;
                   case ')':
                       if (stack.isEmpty()) return false;
                       Character pop = stack.pop();
                       if (pop != '(') return false;
                       break;

                    case ']':
                        if (stack.isEmpty()) return false;
                        Character pop1 = stack.pop();
                        if (pop1 != '[') return false;
                        break;

                    case '}':
                        if (stack.isEmpty()) return false;
                        Character pop2 = stack.pop();
                        if (pop2 != '{') return false;
                        break;
                default:
                    break;
            }
        }
        return stack.isEmpty();
    }
}
