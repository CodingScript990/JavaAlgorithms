package com.example.algorithmscodeup.codeupAlgorithms.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1071 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        for (int i = 0; i < inputNum.length; i++) {
            int OutputA = Integer.parseInt(inputNum[i]);
            if (OutputA == 0) {
                break;
            }
            System.out.println(inputNum[i]);
        }
    }
}
