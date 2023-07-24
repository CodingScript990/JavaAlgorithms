package com.example.algorithmscodeup.programmersAlgorithms.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 원소들의 곱과 합
public class Programmers181929 {
    public int solution(int[] num_list) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        // String Array => "," 기준으로
        String[] arrayStr = reader.readLine().split(",");

        // String Array[String type] => Int Array[Integer type] 로 변환
        num_list = Arrays.stream(arrayStr).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int mulSum = 1;

        for (int i = 0; i < num_list.length; i++) {
            // num_list 의 모든 원소의 합
            sum += num_list[i];
            // num_list 의 모든 원소의 제곱
            mulSum *= num_list[i];
            // 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1
            if (sum * sum > mulSum) answer = 1;
            // 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 크면 0
            else answer = 0;
        }

        System.out.printf("%d\n", num_list.length); // num_list 의 길이 check
        System.out.printf("%d", answer); // answer 의 결과

        // result value => answer
        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181929().solution(new int[]{3,4,5,2,1});
    }
}
