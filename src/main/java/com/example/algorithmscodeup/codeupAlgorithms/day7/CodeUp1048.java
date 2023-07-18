package com.example.algorithmscodeup.codeupAlgorithms.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1048 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String[] inputNum = reader.readLine().split(" ");

       int OutputA = Integer.parseInt(inputNum[0]); // 지수
       int OutputB = Integer.parseInt(inputNum[1]); // 밑

       int result = OutputA << OutputB;

        System.out.printf("%d\n", result);
    }
}
