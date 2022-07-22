package com.security;

interface LambdaExpressionExample2 {
    void draw(int i);
}

public class Lambda {
    public static void main(String[] args) {
        LambdaExpressionExample2 add = Lambda::add;
        add.draw(10);
    }


    public static void add(int i) {
        System.out.println("---" + i);
    }
}
