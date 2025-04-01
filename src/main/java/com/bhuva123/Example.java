package com.bhuva123;

public class Example {
    // The variable is now used in the constructor and getter
    private final int storedValue;

    public Example() {
        this.storedValue = 0; // Initialize with default value
    }

    public Example(int initialValue) {
        this.storedValue = initialValue;
    }

    public int getStoredValue() {
        return storedValue;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }

    public void methodWithNullPointer() {
        String s = null;
        // Add null check to prevent NullPointerException
        if (s != null) {
            System.out.println(s.length());
        } else {
            System.out.println("String is null");
        }
    }

    public void controlledLoop(int maxIterations) {
        // Add exit condition to prevent infinite loop
        int counter = 0;
        while (counter < maxIterations) {
            System.out.println("Controlled loop iteration: " + counter);
            counter++;
        }
    }
}