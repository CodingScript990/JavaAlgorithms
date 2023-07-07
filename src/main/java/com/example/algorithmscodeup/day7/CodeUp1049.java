package com.example.algorithmscodeup.day7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String[] inputNum = reader.readLine().split(" ");

       int OutputA = Integer.parseInt(inputNum[0]);
       int OutputB = Integer.parseInt(inputNum[1]);

       int result = (OutputA > OutputB) ? 1 : 0;

        System.out.printf("%d\n", result);
    }
}
