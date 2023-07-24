package com.example.algorithmscodeup.programmersAlgorithms.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 등차수열의 특정한 항만 더하기
public class Programmers181931 {
    public int solution(int a, int d, boolean[] included) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        a = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());

        for (int i = 1; i < included.length; i++) {
            if (included[i - 1] == true) {
                answer += (a + (i - 1) * d);
            }
        }

        System.out.printf("%d", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181931().solution(3, 4, new boolean[]{true, false, false, true, true});
    }
}
