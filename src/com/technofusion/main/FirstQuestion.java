package com.technofusion.main;

import java.util.*;

public class FirstQuestion {
    public static void main(String[] args) {
        System.out.println(sumPrimeNums());
    }


    public static Integer sumPrimeNums() {
        int count = 0;
        int sum = 0;
        for (int i = 2; count < 1000; i++) {
            if (isPrime(i) == true) {
                sum += i;
                count++;
            }
        }
        return sum;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

