package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 홀짝 구분하기
public class Programmers181944 {
    public static int solution(int inputN) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        inputN = Integer.parseInt(reader.readLine());

        if (inputN % 2 == 0) System.out.printf("%d is even\n", inputN);
        else System.out.printf("%d is odd\n", inputN);

        return inputN;
    }

    public static void main(String[] args) throws IOException {
        int outputN = 0;
        solution(outputN);
    }
}
