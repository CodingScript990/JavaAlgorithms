package com.example.algorithmscodeup.codeupAlgorithms.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8진수 구하기
public class CodeUp1031 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        String octal = Integer.toOctalString(inputNum);

        System.out.printf("%s\n", octal);
    }
}
