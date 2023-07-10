package com.example.algorithmscodeup.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1074 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        for (int i = inputNum; 0 <= i; i--) {
            if (inputNum == 0) break;
            System.out.println(inputNum);
            inputNum --;
        }
    }
}
