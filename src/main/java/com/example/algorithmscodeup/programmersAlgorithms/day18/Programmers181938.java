package com.example.algorithmscodeup.programmersAlgorithms.day18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 두 수의 연산값 비교하기
public class Programmers181938 {
    public int solution(int a, int b) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());

        String inputOne = (a + "") + (b + "");
        String inputTwo = 2 * a * b + "";

        if (Integer.parseInt(inputOne) >= Integer.parseInt(inputTwo)) answer = Integer.parseInt(inputOne);
        else answer = Integer.parseInt(inputTwo);

        System.out.printf("%d", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181938().solution(9, 91);

    }
}
