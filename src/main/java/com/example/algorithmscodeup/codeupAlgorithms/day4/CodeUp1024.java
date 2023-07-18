package com.example.algorithmscodeup.codeupAlgorithms.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1024 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        String[] arrayStr = inputStr.split("");

        for (int i = 0; i < arrayStr.length; i++) {
            System.out.printf("\'%s\'\n", arrayStr[i]);
        }
    }
}
