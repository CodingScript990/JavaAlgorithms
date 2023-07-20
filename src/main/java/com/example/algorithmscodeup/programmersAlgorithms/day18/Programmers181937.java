package com.example.algorithmscodeup.programmersAlgorithms.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// n의 배수
public class Programmers181937 {
    public int solution(int num, int n) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        num = Integer.parseInt(reader.readLine());
        n = Integer.parseInt(reader.readLine());

        if (num % n == 0) answer = 1;
        else answer = 0;

        System.out.printf("%d", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181937().solution(9, 91);
    }
}
