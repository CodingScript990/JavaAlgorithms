package com.example.algorithmscodeup.day9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        long inputNum = Integer.parseInt(reader.readLine());

        long bit = ~inputNum;

        System.out.printf("%d\n", bit);
    }
}
