package com.example.algorithmscodeup.codeupAlgorithms.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1027 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayStr = reader.readLine().split("\\.");

       int year = Integer.parseInt(arrayStr[0]);
       int month = Integer.parseInt(arrayStr[1]);
       int day = Integer.parseInt(arrayStr[2]);

        System.out.printf("%02d-%02d-%04d", day, month, year);
    }
}
