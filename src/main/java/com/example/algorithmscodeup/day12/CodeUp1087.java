package com.example.algorithmscodeup.day12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1087 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());
        int sum = 0;

        for (int i = 1; i <= inputNum; i++) {
            sum += i;
            if (sum >= inputNum) {
                break;
            }
        }
        System.out.println(sum);
    }
}
