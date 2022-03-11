package com.company;

public class Lc_13 {

        public int romanToInt(String s) {
            int[] containNumbers = new int[s.length()];
            int finalNumber =0;
            for (int i =0 ; i< s.length(); ++i) {
                switch (s.charAt(i)) {
                    case 'I': containNumbers[i] = 1; break;
                    case 'V': containNumbers[i] = 5;break;
                    case 'X': containNumbers[i] =10;break;
                    case 'L': containNumbers[i] = 50;break;
                    case 'C': containNumbers[i] = 100;break;
                    case 'D': containNumbers[i] = 500;break;
                    case 'M': containNumbers[i] = 1000;break;
                }
            }

            for(int i =0; i < containNumbers.length; i++) {

                if ( i+1 < containNumbers.length && containNumbers[i] < containNumbers[i+1]){
                    finalNumber += containNumbers[i+1] - containNumbers[i];
                }else {
                    finalNumber += containNumbers[i];
                }

            }
            return finalNumber;
        }
    }

