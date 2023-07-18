package com.example.algorithmscodeup.codeupAlgorithms.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1072 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputNum = reader.readLine();

        String[] inputArr = reader.readLine().split(" ");

        for (String OutputNums : inputArr) {
            System.out.println(OutputNums);
        }
    }
}
