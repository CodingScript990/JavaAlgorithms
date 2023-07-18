package com.example.algorithmscodeup.codeupAlgorithms.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 10진수 구하기 => 영문자
public class CodeUp1036 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char inputNum = reader.readLine().charAt(0);

        int octal = inputNum;

        System.out.printf("%d\n", octal);
    }
}
