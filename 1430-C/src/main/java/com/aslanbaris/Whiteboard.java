package com.aslanbaris;

public class Whiteboard {
    public static String calculateMin(int n) {
        int lastVal = n;
        StringBuilder builder = new StringBuilder();
        for (int i = n -1; i >  0; i--) {
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
