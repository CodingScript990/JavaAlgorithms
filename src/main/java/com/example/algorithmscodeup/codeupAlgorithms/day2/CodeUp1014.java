package com.example.algorithmscodeup.codeupAlgorithms.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp1014 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        String[] arrayChar = {tokenizer.nextToken(), tokenizer.nextToken()};

        System.out.printf("%s %s", arrayChar[1], arrayChar[0]);
    }
}
