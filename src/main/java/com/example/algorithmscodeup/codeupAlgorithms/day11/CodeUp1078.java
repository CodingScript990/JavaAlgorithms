package com.example.algorithmscodeup.codeupAlgorithms.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1078 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        int start = 0;
        int sum = 0;

        for (int i = start; i <= inputNum; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("%d\n", sum);
    }
}
