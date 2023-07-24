package com.example.algorithmscodeup.programmersAlgorithms.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 코드 처리하기
public class Programmers181932 {
    public String solution(String code) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String answer = "";
        code = reader.readLine();
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            // idx 1
            if (code.charAt(idx) == '1') mode = 1 - mode;
            // idx 0
            else if (idx % 2 == mode) answer = answer + code.charAt(idx);
        }

        return "".equals(answer) ? "EMPTY" : answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Programmers181932().solution("abc1abc1abc"));
    }
}
