package com.example.algorithmscodeup.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 두정수의 합
public class CodeUp1038 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arryStr = reader.readLine().split(" ");

        long inputOne = Long.parseLong(arryStr[0]);
        long inputTwo = Long.parseLong(arryStr[1]);

        long result = inputOne + inputTwo;

        System.out.printf("%d\n", result);
    }
}
