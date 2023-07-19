package com.example.algorithmscodeup.programmersAlgorithms.day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 문자 리스트를 문자열로 변환하기
public class Programmers181941 {
    public String solution(String[] arr) throws IOException {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }
        System.out.printf("%s", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181941().solution(new String[]{"a", "b", "c"});

    }
}
