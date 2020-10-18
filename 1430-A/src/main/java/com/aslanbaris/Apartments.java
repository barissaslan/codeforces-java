package com.aslanbaris;

public class Apartments {
    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int SEVEN = 7;

    public static String calculateRooms(int i) {
        if (i % THREE == 0) {
            return (i / THREE) + " 0 0";
        }

        if (i % FIVE == 0) {
            return "0 " + (i / FIVE) + " 0";
        }

        if (i % SEVEN == 0) {
            return "0 0 " + (i / SEVEN);
        }

        if (i >= THREE + FIVE) {
            int temp = i;
            int iterationThree = 0;

            do {
                temp -= THREE;
                iterationThree++;

                if (temp % FIVE == 0) {
                    return iterationThree + " " + (temp / FIVE) + " 0";
                }
            } while (temp > 0);
        }

        if (i >= THREE + SEVEN) {
            int temp = i;
            int iterationThree = 0;

            do {
                temp -= THREE;
                iterationThree++;

                if (temp % SEVEN == 0) {
                    return iterationThree + " 0" + (temp / SEVEN);
                }
            } while (temp > 0);
        }

        if (i >= FIVE + SEVEN) {
            int temp = i;
            int iterationFive = 0;

            do {
                temp -= FIVE;
                iterationFive++;

                if (temp % SEVEN == 0) {
                    return "0 " + iterationFive + " " + (temp / SEVEN);
                }
            } while (temp > 0);
        }


        return null;
    }
}

//3x + 5y + 7z = 67