package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 반복해서 출력하기
public class Programmers181950 {
    public void Solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = reader.readLine().split(" ");

        String inputStr = inputArr[0];
        int inputN = Integer.parseInt(inputArr[1]);

        for (int i = 0; i < inputN; i++) {
            System.out.printf("%s", inputStr);
        }
    }

    public static void main(String[] args) throws IOException {
        new Programmers181950().Solution();
    }
}
