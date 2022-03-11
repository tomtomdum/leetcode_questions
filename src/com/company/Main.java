package com.company;

import java.time.Duration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        long startTime = System.nanoTime();
        Lc_13 lc_13 = new Lc_13();
        System.out.println(lc_13.romanToInt("MCMXCIV"));
        long stopTime = System.nanoTime();
        System.out.println(stopTime - startTime);

    }
}
