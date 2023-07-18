package com.example.algorithmscodeup.codeupAlgorithms.day10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeUp1067 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String inputNum = reader.readLine();

        String msgEven = "even";
        String msgOdd = "odd";

        Long OutputA = Long.parseLong(inputNum);

        if (OutputA < 0) {
            System.out.println("minus");
            if (OutputA % 2 == 0) {
                System.out.println(msgEven);
            } else {
                System.out.println(msgOdd);
            }
        } else {
            System.out.println("plus");
            if (OutputA % 2 == 0) {
                System.out.println(msgEven);
            } else {
                System.out.println(msgOdd);
            }
        }
    }
}
