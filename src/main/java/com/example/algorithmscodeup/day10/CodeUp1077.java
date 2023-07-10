package com.example.algorithmscodeup.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1077 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        int start = 0;

        for (int i = start; i <= inputNum; i++) {
            System.out.printf("%d ", i);
        }
    }
}
