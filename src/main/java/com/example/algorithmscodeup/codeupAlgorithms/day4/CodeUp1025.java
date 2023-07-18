package com.example.algorithmscodeup.codeupAlgorithms.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1025 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayStr = reader.readLine().split("");
        int count = 5;

        for (String str : arrayStr) {
            count--;
            System.out.print("[" + str);

            for (int i = 0; i < count; i++) {
                System.out.print("0");
            }
            System.out.println("]");
        }
    }
}
