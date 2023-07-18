package com.example.algorithmscodeup.codeupAlgorithms.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1073 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = reader.readLine().split(" ");

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i].equals("0")) {
                break;
            }
            System.out.println(inputArr[i]);
        }
    }
}
