package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 대소문자 바꿔서 출력하기
public class Programmers181949 {
    public void Solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = reader.readLine();
        String answer = "";

        for (int i = 0; i < inputStr.length(); i++) {
            char innerChar = inputStr.charAt(i);
            if (Character.isLowerCase(innerChar)) answer += Character.toUpperCase(innerChar);
            else answer += Character.toLowerCase(innerChar);
        }
        System.out.printf("%s", answer);
    }

    public static void main(String[] args) throws IOException {
        new Programmers181949().Solution();
    }
}
