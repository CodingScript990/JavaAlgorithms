package com.example.algorithmscodeup.codeupAlgorithms.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1068 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        switch (inputNum / 10) {
            case 10, 9 -> System.out.println("A");
            case 8, 7 -> System.out.println("B");
            case 6,5,4 -> System.out.println("C");
            default -> System.out.println("D");
        }
    }
}
