package com.example.algorithmscodeup.codeupAlgorithms.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1083 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        int start = 1;
        String msg = "X";

        for (int i = start; i <= inputNum; i++) {
            if (i % 3 == 0) System.out.printf("%s ", msg);
            else System.out.printf("%s ", i);
        }
    }
}
