package com.company;

import java.util.Scanner;

public class javaEndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String line;
        int i = 1;
        while(scanner.hasNext())
        {
            line = scanner.nextLine();
            System.out.println(i + " "+ line);
            i++;
        }
    }
}
