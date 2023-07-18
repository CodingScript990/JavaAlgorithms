package com.example.algorithmscodeup.codeupAlgorithms.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1081 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = reader.readLine().split(" ");

        int inputOne = Integer.parseInt(inputArr[0]); // 1 2
        int inputTwo = Integer.parseInt(inputArr[1]); // 1 2 3


        for (int i = 1; i <= inputOne; i++) {
            for (int j = 1; j <= inputTwo; j++) {
                System.out.printf("%d %d\n", i, j);
            }
        }
    }
}
