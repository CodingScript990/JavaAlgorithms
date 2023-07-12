package com.example.algorithmscodeup.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = reader.readLine().split(" ");

        double weight = Double.parseDouble(inputArr[0]);
        double height = Double.parseDouble(inputArr[1]);
        double bit = Double.parseDouble(inputArr[2]);

        double result = (weight * height * bit) / 8 / 1024 / 1024;
        System.out.printf("%.2f MB\n", result);
    }
}
