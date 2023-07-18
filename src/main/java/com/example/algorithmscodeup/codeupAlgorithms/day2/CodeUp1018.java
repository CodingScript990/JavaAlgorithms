package com.example.algorithmscodeup.codeupAlgorithms.day2;

import java.io.*;

public class CodeUp1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] arrayStr = reader.readLine().split(":");

        System.out.printf("%s:%s", arrayStr[0], arrayStr[1]);
    }
}
