package com.bhuva123;

import java.util.ArrayList;
import java.util.List;

public class BuggyClass {

    public static String stringField;
    private List items = new ArrayList(); // Raw type - PMD and SpotBugs should flag this

    public void nullCheck(String input) {
        if (input.equals("test")) { // Potential NPE - Should be detected
            System.out.println("Input is test");
        }
    }

    public void unusedVariable() {
        int unused = 10; // Unused variable - Should be detected
        System.out.println("Method with unused variable");
    }

    public List getItems() {
        return items; // Returns reference to mutable object - SpotBugs should flag this
    }

    public boolean compareStrings(String a, String b) {
        if (a == b) { // Should use equals() - PMD should flag this
            return true;
        }
        return false;
    }

    public void switchWithoutDefault(int value) {
        switch (value) { // Missing default case - Should be detected
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
        }
    }
}
