package com.example.algorithmscodeup.codeupAlgorithms.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1089 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int start = Integer.parseInt(inputNum[0]); // a
        int order = Integer.parseInt(inputNum[1]); // d
        int integer = Integer.parseInt(inputNum[2]); // n

        int result = start;

        for (int i = 1; i < integer; i++) {
            result += order;
        }
        System.out.printf("%d\n", result);
    }
}
