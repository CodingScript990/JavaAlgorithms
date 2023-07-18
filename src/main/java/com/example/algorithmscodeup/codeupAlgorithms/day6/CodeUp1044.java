package com.example.algorithmscodeup.codeupAlgorithms.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1044 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long inputNum = Long.parseLong(reader.readLine());

        System.out.printf("%d\n", inputNum + 1);
    }
}
