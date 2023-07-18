package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 덧셈식 출력하기
public class Programmers181947 {
    public void Solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = reader.readLine().split(" ");
        int inputA = Integer.parseInt(inputArr[0]);
        int inputB = Integer.parseInt(inputArr[1]);
        int result = inputA + inputB;

        System.out.printf("%d + %d = %d", inputA, inputB, result);
    }

    public static void main(String[] args) throws IOException {
        new Programmers181947().Solution();
    }
}
