package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 출력하기
public class Programmers181952 {
    public void Solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = reader.readLine();

        System.out.printf("%s", inputStr);
    }

    public static void main(String[] args) throws IOException {
        new Programmers181952().Solution();
    }
}
