package com.example.algorithmscodeup.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayStr = reader.readLine().split(":");

        System.out.printf("%d", Integer.parseInt(arrayStr[1]));
    }
}
