package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class javaHashset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t     = scanner.nextInt();
        String [] pair_left  = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i]  = scanner.next();
            pair_right[i] = scanner.next();
        }
        scanner.close();

        HashSet<String> set = new HashSet(t);
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        }
    }
}
