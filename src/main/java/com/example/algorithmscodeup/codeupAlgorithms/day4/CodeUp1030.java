package com.example.algorithmscodeup.codeupAlgorithms.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1030 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String strNum = reader.readLine();

        if (strNum.equals("-")) {
            System.out.printf("-%s", strNum);
        } else {
            System.out.printf("%s", strNum);
        }
    }
}
