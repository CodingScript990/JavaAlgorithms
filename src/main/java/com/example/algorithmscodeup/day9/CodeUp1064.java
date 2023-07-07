package com.example.algorithmscodeup.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1064 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int OutputA = Integer.parseInt(inputNum[0]);
        int OutputB = Integer.parseInt(inputNum[1]);
        int OutputC = Integer.parseInt(inputNum[2]);

        int result = OutputA > OutputB ? OutputB : OutputA;
        result = result > OutputC ? OutputC : result;

        System.out.printf("%d\n", result);
    }
}
