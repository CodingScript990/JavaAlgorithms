package com.example.algorithmscodeup.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

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
