package com.bhuva123;

public class Example {
    private int unusedVariable;

    public void doSomething() {
        System.out.println("Doing something");
    }

    public void methodWithNullPointer() {
        String s = null;
        System.out.println(s.length());  // This will cause a null pointer exception
    }

    public void infiniteLoop() {
        while (true) {
            System.out.println("Infinite loop");
        }
    }
}
