package com.example.algorithmscodeup.day2;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1013 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String formatStr = reader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(formatStr);

        int inputOne = Integer.parseInt(stringTokenizer.nextToken());
        int inputTwo = Integer.parseInt(stringTokenizer.nextToken());

        System.out.printf("%d %d", inputOne, inputTwo);

    }
}
