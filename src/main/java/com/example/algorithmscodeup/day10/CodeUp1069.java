package com.example.algorithmscodeup.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1069 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        char inputNum = reader.readLine().charAt(0);

        switch (inputNum) {
            case 'A' -> System.out.println("best!!!");
            case 'B' -> System.out.println("good!!");
            case 'C' -> System.out.println("run!");
            case 'D' -> System.out.println("slowly~");
            default -> System.out.println("what?");
        }
    }
}
