package com.example.algorithmscodeup.day11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1082 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputStr = reader.readLine(); // B

        int outputHex = Integer.valueOf(inputStr, 16);
        String repetition, result;

        for (int i = 1; i < 16; i++) {
            repetition = Integer.toHexString(i).toUpperCase(); // 대문자 변환
            result = Integer.toHexString(outputHex * i).toUpperCase();
            System.out.printf("%X*%s=%s\n", outputHex, repetition, result);
        }
    }
}
