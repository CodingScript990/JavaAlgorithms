package com.example.algorithmscodeup.programmersAlgorithms.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자열 썪기
public class Programmers181942 {
    public String solution(String str1, String str2) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = "";
        str1 = reader.readLine();
        str2 = reader.readLine();

        for (int i = 0; i < str1.length(); i++) {
            answer = answer + str1.charAt(i) + str2.charAt(i);
        }

        System.out.printf("%s", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181942().solution("aaaaa", "bbbbb");

    }
}
