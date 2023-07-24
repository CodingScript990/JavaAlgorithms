package com.example.algorithmscodeup.programmersAlgorithms.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 이어 붙인 수
public class Programmers181928 {
    public int solution(int[] num_list) throws IOException {
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        // String Array => "," 기준으로
        String[] arrayStr = reader.readLine().split(",");

        // String Array[String type] => Int Array[Integer type] 로 변환
        num_list = Arrays.stream(arrayStr).mapToInt(Integer::parseInt).toArray();

        String evenSum = "";
        String oddSum = "";

        for (int i = 0; i < num_list.length; i++) {
            // 홀수만 순서대로 이어 붙인 수의 합
            if (num_list[i] % 2 == 0) evenSum += Integer.toString(num_list[i]);
            // 짝수만 순서대로 이어 붙인 수의 합
            else oddSum += Integer.toString(num_list[i]);
        }

        answer = Integer.parseInt(evenSum) + Integer.parseInt(oddSum);

        System.out.printf("%d\n", num_list.length); // num_list 의 길이 check
        System.out.printf("%d", answer); // answer 의 결과

        // result value => answer
        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181928().solution(new int[]{3,4,5,2,1});
    }
}
