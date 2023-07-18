package com.example.algorithmscodeup.codeupAlgorithms.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1080 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        int sum = 0;

        for (int i = 0; i < inputNum; i++) {
            sum += i;
            if (sum >= inputNum) {
                System.out.println(i);
                break;
            }
        }
    }
}
