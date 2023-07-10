package com.example.algorithmscodeup.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1076 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char inputNum = reader.readLine().charAt(0);
        char start = 'a';

        for (char i = start; i <= inputNum; i++) {
            System.out.printf("%s ", i);
        }
    }
}
