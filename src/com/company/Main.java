package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long startTime = System.nanoTime();
        Lc_13 lc_13 = new Lc_13();
        System.out.println(lc_13.romanToInt("MCMXCIV"));
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

        startTime = System.nanoTime();
        Lc_1 lc_1 = new Lc_1();
        System.out.println(Arrays.toString(lc_1.twoSum(new int[]{2, 7, 11, 15}, 9)));
        stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

    }
}
