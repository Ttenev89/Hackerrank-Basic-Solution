package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class javaList {
    public static void main(String[] args) {
        /* Create and fill Linked List of Integers */
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList();
        for (int i = 0; i < N; i++) {
            int value = scanner.nextInt();
            list.add(value);
        }

        /* Perform queries on Linked List */
        int Q = scanner.nextInt();
        for (int i = 0; i < Q; i++) {
            String action = scanner.next();
            int index = scanner.nextInt();
            if (action.equals("Insert")) {
                int value = scanner.nextInt();
                list.add(index, value);
            } else { // "Delete"
                list.remove(index);
            }
        }
        scanner.close();

        /* Print our updated Linked List */
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
