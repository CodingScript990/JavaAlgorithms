package com.example.algorithmscodeup.codeupAlgorithms.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1029 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double inputNum = Double.parseDouble(reader.readLine());
        String strNum = String.format("%.11f", inputNum);

        System.out.printf("%s", strNum);
    }
}
