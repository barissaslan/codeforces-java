package com.aslanbaris;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BarrelsApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(in.readLine());
        String output = "";

        for (int i = 0; i < t; i++) {
            String[] lines = in.readLine().split(" ");
            String[] waters = in.readLine().split(" ");

            int w = Integer.parseInt(lines[0]);
            int p = Integer.parseInt(lines[1]);

            long[] longWatters = new long[waters.length];

            if (w == p + 1) {
                long sum = 0;
                for (int j = 0; j < waters.length; j++) {
                    sum += Integer.parseInt(waters[j]);
                }
                output += sum + "\n";
            } else {
                for (int j = 0; j < waters.length; j++) {
                    longWatters[j] = Integer.parseInt(waters[j]);
                }
                output += new Barrels(longWatters, p).calculateMaxDifference() + "\n";
            }

        }

        System.out.println(output);
    }
}


class Barrels {

    private final long[] waterArr;
    private final int numberOfPourings;

    public Barrels(long[] waterArr, int numberOfPourings) {
        this.waterArr = waterArr;
        this.numberOfPourings = numberOfPourings;
    }

    public long calculateMaxDifference() {
        boolean isFullZero = true;
        for (int i = 0; i < waterArr.length - 1; i++) {
            if (waterArr[i] > 0) {
                isFullZero = false;
                break;
            }
        }

        if (isFullZero) {
            return 0;
        }

        int lastIndex = waterArr.length - 1;
        QuickSort.sort(waterArr, 0, lastIndex);

        long maxAmountOfWater = waterArr[lastIndex];

        for (int i = 0; i < numberOfPourings; i++) {
            maxAmountOfWater += waterArr[--lastIndex];
        }

        return maxAmountOfWater;
    }
}


class QuickSort {

    private static int partition(long[] arr, int low, int high) {
        long pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                long temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        long temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void sort(long[] arr, int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}

