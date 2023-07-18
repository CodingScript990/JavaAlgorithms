package com.example.algorithmscodeup.codeupAlgorithms.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1020 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayStr = reader.readLine().split("-");

        System.out.printf("%s%s", arrayStr[0], arrayStr[1]);
    }
}
