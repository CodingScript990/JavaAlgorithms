package com.example.algorithmscodeup.programmersAlgorithms.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 곱하기
public class Programmers181940 {
    public String solution(String my_string, int k) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        my_string = reader.readLine();
        k = Integer.parseInt(reader.readLine());
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }
        System.out.printf("%s", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181940().solution("string", 3);

    }
}
