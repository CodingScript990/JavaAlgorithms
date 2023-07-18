package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// a,b 문자열 출력하기
public class Programmers181951 {
    public void Solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = reader.readLine().split(" ");
        int inputA = Integer.parseInt(inputArr[0]);
        int inputB = Integer.parseInt(inputArr[1]);

        System.out.printf("a = %d\nb = %d", inputA, inputB);
    }

    public static void main(String[] args) throws IOException {
        new Programmers181951().Solution();
    }
}
