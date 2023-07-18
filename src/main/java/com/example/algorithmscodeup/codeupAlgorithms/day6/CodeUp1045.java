package com.example.algorithmscodeup.codeupAlgorithms.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1045 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int inputA = Integer.parseInt(inputNum[0]);
        int inputB = Integer.parseInt(inputNum[1]);

        int sum = inputA + inputB;
        int sub = inputA - inputB;
        int mul = inputA * inputB;
        double division = (double) inputA / (double) inputB;
        int remainder = inputA % inputB;


        System.out.printf("%d\n", sum);
        System.out.printf("%d\n", sub);
        System.out.printf("%d\n", mul);
        System.out.printf("%d\n", (int)division);
        System.out.printf("%d\n", remainder);
        System.out.printf("%.2f\n", (float)(division));
    }
}
