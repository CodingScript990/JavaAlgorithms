package com.example.algorithmscodeup.codeupAlgorithms.day13;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        StringTokenizer arrToken = new StringTokenizer(reader.readLine());
        int[] arr = new int[23];

        for (int i = 0; i < inputNum; i++) {
            int temp = Integer.parseInt(arrToken.nextToken());
            arr[temp - 1]++;
        }

        for (int arrList : arr) {
            System.out.printf("%d ", arrList);
        }
    }
}
