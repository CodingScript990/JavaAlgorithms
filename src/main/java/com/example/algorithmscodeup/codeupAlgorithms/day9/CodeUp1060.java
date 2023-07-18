package com.example.algorithmscodeup.codeupAlgorithms.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1060 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        long OutputA = Long.parseLong(inputNum[0]);
        long OutputB = Long.parseLong(inputNum[1]);

        long result = OutputA & OutputB;

        System.out.printf("%d\n", result);
    }
}
