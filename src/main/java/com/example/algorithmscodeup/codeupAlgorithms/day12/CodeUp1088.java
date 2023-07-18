package com.example.algorithmscodeup.codeupAlgorithms.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1088 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= inputNum; i++) {
            if (i % 3 == 0) continue;
            System.out.printf("%d ", i);
        }
    }
}
