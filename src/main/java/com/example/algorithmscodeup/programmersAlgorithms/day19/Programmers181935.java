package com.example.algorithmscodeup.programmersAlgorithms.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 홀짝에 따라 다른 값 반환하기
public class Programmers181935 {
    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        int n = Integer.parseInt(reader.readLine()); // 배수

        for (int i = 1; i <= n; i++) {
            if (n % 2 == 1 && i % 2 == 1) answer += i;
            else if (n % 2 == 0 && i % 2 == 0) answer += i * i;
        }

        System.out.printf("%d", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181935().solution();
    }
}
