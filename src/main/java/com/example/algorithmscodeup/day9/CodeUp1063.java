package com.example.algorithmscodeup.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1063 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        long OutputA = Long.parseLong(inputNum[0]);
        long OutputB = Long.parseLong(inputNum[1]);

        /*
        if (OutputA > OutputB) {
            System.out.println(OutputA);
        } else {
            System.out.println(OutputB);
        }
         */

        long result = (OutputA > OutputB) ? OutputA : OutputB;

        System.out.println(result);
    }
}
