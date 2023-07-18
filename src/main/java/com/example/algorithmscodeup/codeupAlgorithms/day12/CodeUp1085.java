package com.example.algorithmscodeup.codeupAlgorithms.day12;

import java.io.*;

public class CodeUp1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = reader.readLine().split(" ");

        double hz = Double.parseDouble(inputArr[0]);
        double bit = Double.parseDouble(inputArr[1]);
        double channel = Double.parseDouble(inputArr[2]);
        double sec = Double.parseDouble(inputArr[3]);

        double result = (hz * bit * channel * sec) / 8 / 1024 / 1024;
        System.out.printf("%.1f MB\n", result);
    }
}
