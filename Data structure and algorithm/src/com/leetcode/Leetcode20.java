package com.leetcode;

import java.util.Stack;

public class Leetcode20 {

    public boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for(char c: s.toCharArray()){
            if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(stack.isEmpty()||c!=stack.pop()) return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode20 leetcode2=new Leetcode20();
        leetcode2.isValid("((){}{}");
    }
}
