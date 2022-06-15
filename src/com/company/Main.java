package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] numbers = {1.3, 2.1, 4.4, -2.6, -4.6, 6.2, -5.1, 5.8, -9.4, -6.3, 3.1, -6.3, -8.5, 4.8, 5.8};
        boolean negative = false;
        double sum = 0;
        int lenth = 0;
        double arif;
        boolean dot = false;


        while (! dot) {
            dot = true;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    dot = false;
                    arif = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = arif;
                }
                System.out.println(Arrays.toString(numbers));
            }
        }


        
        for (double currentNumbers : numbers ) {
            if (currentNumbers < 0){
                negative = true;
            }
            if (negative){
                if(currentNumbers > 0){
                    sum = sum + currentNumbers;
                    lenth++;
                }
            }
        }

        double ar = sum / lenth;
        System.out.println("Ср. ар; " + ar);

    }
}




















