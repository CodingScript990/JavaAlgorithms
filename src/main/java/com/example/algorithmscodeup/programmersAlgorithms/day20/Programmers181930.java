package com.example.algorithmscodeup.programmersAlgorithms.day20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 주사위 게임 2
public class Programmers181930 {
    public int solution(int a, int b, int c) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;

        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());

        int sum = a + b + c;
        int squareSum = a * a + b * b + c * c;
        int cubicSum = a * a * a + b * b * b + c * c * c;

        // 3숫자가 모두 다를면?
        if (a != b && b != c && a != c) answer += sum;

        // 3숫자 중 두 숫자는 같고 나머지가 다르면?
        else if (a == b && b != c || a == c && c != b || a != b && b == c) answer = sum * squareSum;

        // 3숫자가 모두 같으면?
        else answer = sum * squareSum * cubicSum;

        System.out.printf("%d", answer);

        return answer;
    }

    public static void main(String[] args) throws IOException {
        new Programmers181930().solution(2, 6, 1);
    }
}
