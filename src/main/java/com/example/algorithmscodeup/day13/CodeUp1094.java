package com.example.algorithmscodeup.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class CodeUp1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        StringTokenizer arrToken = new StringTokenizer(reader.readLine());
        int[] inputArr = new int[inputNum];

        for (int i = inputNum - 1; i > -1; i--) {
            inputArr[i] = Integer.parseInt(arrToken.nextToken());
        }

        for (int reverseList : inputArr) {
            System.out.printf("%d ", reverseList);
        }
    }
}
