package com.hiton.employee.service;

public class demo {


    //Given an expression string exp, write a program to examine whether the pairs and the orders of “{“, “}”, “(“, “)”, “[“, “]” are correct in the given expression
    public static void main(String [] args) {

        String expression = "[]";

        if (checkExpression(expression)) {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
    public static boolean checkExpression(String s) {

       int count = 0;

        for (char c : s.toCharArray()) {
            if(c == '{' || c=='[' || c=='(') {
                count++;
            } else if (c =='}' || c==']' || c==')') {
                count--;
            }
         //  System.out.println(count);
            if (count<0) {
                return false;
            }
        }
     //   System.out.println(count);
        return true;


    }
}
