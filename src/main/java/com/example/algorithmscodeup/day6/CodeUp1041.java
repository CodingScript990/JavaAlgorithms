package com.example.algorithmscodeup.day6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1041 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char inputNum = reader.readLine().charAt(0);

        System.out.printf("%s\n", (char)(inputNum + 1));
    }
}
