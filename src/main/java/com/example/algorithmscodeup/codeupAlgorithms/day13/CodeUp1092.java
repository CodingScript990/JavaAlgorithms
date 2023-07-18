package com.example.algorithmscodeup.codeupAlgorithms.day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1092 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        int a = Integer.parseInt(inputNum[0]); // 3
        int b = Integer.parseInt(inputNum[1]); // 7
        int c = Integer.parseInt(inputNum[2]); // 9

        int day = 1;

        while (day % a != 0 || day % b != 0 || day % c != 0) {
            day++;
        }
        System.out.printf("%d", day);
    }
}
