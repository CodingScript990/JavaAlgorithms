package com.example.algorithmscodeup.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1043 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int inputA = Integer.parseInt(inputNum[0]);
        int inputB = Integer.parseInt(inputNum[1]);

        int result = inputA % inputB;

        System.out.printf("%d\n", result);
    }
}
