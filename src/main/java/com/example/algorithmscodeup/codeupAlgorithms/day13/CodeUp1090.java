package com.example.algorithmscodeup.codeupAlgorithms.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1090 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        long start = Integer.parseInt(inputNum[0]); // a
        long equivalent = Integer.parseInt(inputNum[1]); // r
        long integer = Integer.parseInt(inputNum[2]); // n

        long result = start;

        for (int i = 1; i < integer; i++) {
            result *= equivalent;
        }
        System.out.printf("%d\n", result);
    }
}
