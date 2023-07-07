package com.example.algorithmscodeup.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1017 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputInt = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", inputInt);
        }
    }
}
