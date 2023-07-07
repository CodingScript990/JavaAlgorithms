package com.example.algorithmscodeup.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10진수 구하기
public class CodeUp1034 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputNum = reader.readLine();

        int octal = Integer.parseInt(inputNum, 8); // 8

        System.out.printf("%d\n", octal);
    }
}
