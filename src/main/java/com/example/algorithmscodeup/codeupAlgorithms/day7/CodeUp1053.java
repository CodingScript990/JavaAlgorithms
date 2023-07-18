package com.example.algorithmscodeup.codeupAlgorithms.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1053 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       int inputNum = Integer.parseInt(reader.readLine());

       int result = (inputNum == 0) ? 1 : 0;

        System.out.printf("%d\n", result);
    }
}
