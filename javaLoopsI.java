package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class javaLoopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = N * i;
            System.out.printf("%d x %d = %d\n", N, i, sum);
        }

        bufferedReader.close();
    }
}
