package com.example.algorithmscodeup.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1023 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine();
        String[] arrayStr = inputStr.split("\\.");

        int firstNum = Integer.valueOf(arrayStr[0]);
        int lastNum = Integer.valueOf(arrayStr[1]);

        System.out.printf("%d\n%d", firstNum, lastNum);

    }
}
