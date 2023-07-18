package com.example.algorithmscodeup.codeupAlgorithms.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1066 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputNum = reader.readLine().split(" ");

        String msgEven = "even";
        String msgOdd = "odd";

        int OutputA = Integer.parseInt(inputNum[0]);
        int OutputB = Integer.parseInt(inputNum[1]);
        int OutputC = Integer.parseInt(inputNum[2]);

        if (OutputA % 2 == 0) {
            System.out.println(msgEven);
        } else if (OutputA % 2 == 1) {
            System.out.println(msgOdd);
        }
        if (OutputB % 2 == 0) {
            System.out.println(msgEven);
        } else if (OutputB % 2 == 1) {
            System.out.println(msgOdd);
        }
        if (OutputC % 2 == 0) {
            System.out.println(msgEven);
        } else if (OutputC % 2 == 1) {
            System.out.println(msgOdd);
        }
    }
}
