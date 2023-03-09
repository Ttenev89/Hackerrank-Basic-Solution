package com.company;

import java.util.Scanner;

public class javaStringTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] tokens = S.split("[^a-zA-Z]");
        int numTokens = 0;

        for (String token : tokens)
            if (token.length() > 0)
                numTokens++;

        System.out.println(numTokens);

        for (String token : tokens)
            if (token.length() > 0)
                System.out.println(token);
    }
}
