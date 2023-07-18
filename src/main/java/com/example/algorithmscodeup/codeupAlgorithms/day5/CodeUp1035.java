package com.example.algorithmscodeup.codeupAlgorithms.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 8진수 구하기
public class CodeUp1035 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputNum = reader.readLine();

        int hex = Integer.parseInt(inputNum, 16); // 16

        String octal = Integer.toOctalString(hex);

        System.out.printf("%s\n", octal);
    }
}
