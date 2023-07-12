package com.example.algorithmscodeup.day12;

import java.io.*;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // 시간복잡도 개선
        try {
            String[] inputArr = reader.readLine().split(" ");
            int sum = 0;
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

            for (int i = 0; i < Integer.valueOf(inputArr[0]); i++) {
                for (int j = 0; j < Integer.valueOf(inputArr[1]); j++) {
                    for (int k = 0; k < Integer.valueOf(inputArr[2]); k++) {
                        writer.write(i + " " + j + " " + k + "\n");
                        sum++;
                    }
                }
            }
            writer.write(String.valueOf(sum));
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        [Memory Exceed]
        int inputOne = Integer.parseInt(inputArr[0]);
        int inputTwo = Integer.parseInt(inputArr[1]);
        int inputThree = Integer.parseInt(inputArr[2]);
        int sum = 0;

        for (int i = 0; i < inputOne; i++) {
            for (int j = 0; j < inputTwo; j++) {
                for (int k = 0; k < inputThree; k++) {
                    System.out.printf("%d %d %d\n", i, j, k);
                    sum += 1;
                }
            }
        }
        System.out.println(sum);

         */
    }
}
