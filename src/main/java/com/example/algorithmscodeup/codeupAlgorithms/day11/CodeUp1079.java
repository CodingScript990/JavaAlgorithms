package com.example.algorithmscodeup.codeupAlgorithms.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1079 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = reader.readLine().split(" ");

        for (String OutputNum : inputArr) {
            System.out.println(OutputNum);
            if (OutputNum.equals("q")) break;
        }
    }
}
