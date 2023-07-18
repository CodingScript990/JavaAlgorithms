package com.example.algorithmscodeup.codeupAlgorithms.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1046 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int inputA = Integer.parseInt(inputNum[0]);
        int inputB = Integer.parseInt(inputNum[1]);
        int inputC = Integer.parseInt(inputNum[2]);

        int sum = inputA + inputB + inputC;
        double division = (double) sum / 3;


        System.out.printf("%d\n", sum);
        System.out.printf("%.1f\n", division);
    }
}
