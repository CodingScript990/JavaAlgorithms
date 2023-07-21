package com.example.algorithmscodeup.programmersAlgorithms.day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 조건 문자열
public class Programmers181934 {
    public int solution(String ineq, String eq, int n, int m) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        ineq = reader.readLine();
        eq = reader.readLine();
        n = Integer.parseInt(reader.readLine());
        m = Integer.parseInt(reader.readLine());

        if (ineq.equals(">")) {
            if (eq.equals("=")) return n >= m ? 1 : answer;
            else if (eq.equals("!")) return n > m ? 1 : answer;
        } else if (ineq.equals("<")) {
            if (eq.equals("="))  return n <= m ? 1 : answer;
            else if (eq.equals("!")) return n < m ? 1 : answer;
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Programmers181934().solution("<", "=", 20, 50));
    }
}
