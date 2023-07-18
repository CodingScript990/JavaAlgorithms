package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 돌리기
public class Programmers181945 {
    public void Solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = reader.readLine().split("");

        for (int i = 0; i < inputArr.length; i++) {
            System.out.printf("%s\n", inputArr[i]);
        }
    }

    public static void main(String[] args) throws IOException {
        new Programmers181945().Solution();
    }
}
