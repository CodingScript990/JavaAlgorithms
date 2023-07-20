package com.example.algorithmscodeup.programmersAlgorithms.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 공배수
public class Programmers181936 {
    public int solution(int number, int n, int m) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        number = Integer.parseInt(reader.readLine()); // 정수
        n = Integer.parseInt(reader.readLine()); // 배수
        m = Integer.parseInt(reader.readLine()); // 배수

        if (number % n == 0 && number % m == 0) answer = 1;
        else answer = 0;

        System.out.printf("%d", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181936().solution(60, 2, 3);
    }
}
