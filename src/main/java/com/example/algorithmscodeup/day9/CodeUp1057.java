package com.example.algorithmscodeup.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1057 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int OutputA = Integer.parseInt(inputNum[0]);
        int OutputB = Integer.parseInt(inputNum[1]);

        if ((OutputA == 1 && OutputB == 1) || (OutputA == 0 && OutputB == 0)) System.out.println(1);
        else System.out.println(0);
    }
}
