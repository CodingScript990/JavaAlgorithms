package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 붙여서 출력하기
public class Programmers181946 {
    public void Solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inputArr = reader.readLine().split(" ");
        String inputFirst = inputArr[0];
        String inputLast = inputArr[1];

        System.out.printf("%s%s", inputFirst, inputLast);
    }

    public static void main(String[] args) throws IOException {
        new Programmers181946().Solution();
    }
}
