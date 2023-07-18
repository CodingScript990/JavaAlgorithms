package com.example.algorithmscodeup.codeupAlgorithms.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 한개 정수 부호 바꾸기
public class CodeUp1040 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        System.out.printf("%d\n", inputNum * -1);
    }
}
