package com.example.algorithmscodeup.codeupAlgorithms.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1019 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        String[] arrayStr = inputStr.split("\\.");

        int year = Integer.valueOf(arrayStr[0]);
        int month = Integer.valueOf(arrayStr[1]);
        int day = Integer.valueOf(arrayStr[2]);


        System.out.printf("%04d.%02d.%02d", year, month, day);
    }
}
