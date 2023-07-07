package com.example.algorithmscodeup.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ascii => 영문자
public class CodeUp1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int inputNum = Integer.parseInt(reader.readLine());

        char asciiNum = Character.valueOf((char)inputNum);

        System.out.printf("%s\n", asciiNum);
    }
}
