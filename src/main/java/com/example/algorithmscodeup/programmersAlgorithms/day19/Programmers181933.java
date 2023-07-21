package com.example.algorithmscodeup.programmersAlgorithms.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// flag에 따라 다른 값 반환하기
public class Programmers181933 {
    public int solution(int a, int b, boolean flag) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        flag = Boolean.parseBoolean(reader.readLine());

        if (flag) return a + b;
         else return a - b;

    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Programmers181933().solution(-4, 7, true));
    }
}
