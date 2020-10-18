package com.aslanbaris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApartmentsApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());
        String out = "";
        for (int i = 0; i < t; i++) {
            String res = Apartments.calculateRooms(Integer.parseInt(in.readLine()));
            if (res == null) {
                out += "-1\n";
            } else {
                out += res + "\n";
            }
        }

        System.out.println(out);
    }
}
