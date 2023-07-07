package com.example.algorithmscodeup.day2;

import java.io.*;

public class CodeUp1012 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            float floatNumber = Float.parseFloat(reader.readLine());
            String formatFloat = String.format("%f", floatNumber);
            writer.write(formatFloat + "\n");
            writer.flush();
            writer.close();
            reader.close();
        } catch (Exception err) {
            err.printStackTrace();
        }
    }
}
