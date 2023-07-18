package com.example.algorithmscodeup.codeupAlgorithms.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1015 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        float inputFloat = Float.parseFloat(reader.readLine());

        System.out.printf("%.2f", inputFloat);
    }
}
