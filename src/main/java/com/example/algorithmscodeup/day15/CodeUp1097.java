package com.example.algorithmscodeup.day15;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CodeUp1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[19][19];

        for (int i = 0; i < 19; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            for (int j = 0; j < 19; j++) {
                board[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        
        int inputNum = Integer.parseInt(reader.readLine());

        for (int i = 0; i < inputNum; i++) {
            StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
            int x = Integer.parseInt(tokenizer.nextToken()) - 1;
            int y = Integer.parseInt(tokenizer.nextToken()) - 1;

            for (int j = 0; j < 19; j++) {
                if (board[x][j] == 0) board[x][j] = 1;
                else board[x][j] = 0;
            }

            for (int j = 0; j < 19; j++) {
                if (board[j][y] == 0) board[j][y] = 1;
                else board[j][y] = 0;
            }
        }

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                System.out.printf("%d ", board[i][j]);
            }
            System.out.println();
        }
    }
}
