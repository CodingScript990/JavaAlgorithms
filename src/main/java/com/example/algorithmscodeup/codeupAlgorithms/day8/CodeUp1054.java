package com.example.algorithmscodeup.codeupAlgorithms.day8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1054 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int OutputA = Integer.parseInt(inputNum[0]);
        int OutputB = Integer.parseInt(inputNum[1]);

        int result = ((OutputA == 1) && (OutputB == 1)) ? 1 : 0;

        System.out.printf("%d\n", result);
    }
}
