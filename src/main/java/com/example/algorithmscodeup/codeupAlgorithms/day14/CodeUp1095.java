package com.example.algorithmscodeup.codeupAlgorithms.day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        StringTokenizer arrToken = new StringTokenizer(reader.readLine());
        int[] inputArr = new int[inputNum];
        int min = 24;

        for (int i = 1; i < inputNum; i++) {
            inputArr[i] = Integer.parseInt(arrToken.nextToken());
            if (inputArr[i] < min) {
                min = inputArr[i];
            }
        }
        System.out.printf("%d", min);
    }
}
