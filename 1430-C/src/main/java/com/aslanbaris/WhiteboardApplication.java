package com.aslanbaris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteboardApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(in.readLine());
            builder.append(calculateMin(n));
            builder.append("\n");
        }

        System.out.println(builder);
    }

    public static String calculateMin(int n) {
        int lastVal = n;
        StringBuilder builder = new StringBuilder();
        for (int i = n - 1; i > 0; i--) {
            builder.append("\n");
            builder.append(lastVal);
            builder.append(" ");
            builder.append(i);

            int sum = lastVal + i;
            lastVal = sum % 2 == 0 ? sum / 2 : (sum / 2) + 1;
        }

        return lastVal + builder.toString();
    }
}

