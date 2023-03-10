package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class patternSyntaxChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases > 0) {
            String pattern = scanner.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Throwable t) {
                System.out.println("Invalid");
            }
            testCases--;
            //Write your code
        }
    }
}
