package com.bhuva123;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuggyClass {

    public static final String stringField = ""; // Made it final since it's static
    private final List<String> items = new ArrayList<>(); // Added generic type parameter

    public void nullCheck(String input) {
        if (input != null && input.equals("test")) { // Added null check to prevent NPE
            System.out.println("Input is test");
        }
    }

    public void unusedVariable() {
        // Removed unused variable
        System.out.println("Method with unused variable");
    }

    public List<String> getItems() {
        return Collections.unmodifiableList(items); // Return unmodifiable view to protect internal state
    }

    public boolean compareStrings(String a, String b) {
        if (a != null && a.equals(b)) { // Fixed string comparison to use equals() with null check
            return true;
        }
        return false;
    }

    public void switchWithoutDefault(int value) {
        switch (value) { // Added default case
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Other value");
                break;
        }
    }
}