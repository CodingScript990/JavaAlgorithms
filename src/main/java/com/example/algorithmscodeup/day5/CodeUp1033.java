package com.example.algorithmscodeup.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 16진수 구하기
public class CodeUp1033 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        String hexaDecimal = Integer.toHexString(inputNum);

        System.out.printf("%s\n", hexaDecimal.toUpperCase());
    }
}
