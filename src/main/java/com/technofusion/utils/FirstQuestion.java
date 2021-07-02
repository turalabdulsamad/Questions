/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technofusion.utils;

/**
 *
 * @author dell
 */
public class FirstQuestion {

    public static void displaySum() {
        int sum = sumPrimeNums();
        System.out.println("----------------------");
        System.out.println("The sum is "+ sum);
        System.out.println("----------------------");

    }

    private static Integer sumPrimeNums() {
        int count = 0;
        int sum = 0;
        for (int i = 2; count < 10; i++) {
            if (isPrime(i) == true) {
                sum += i;
                count++;
            }
        }
        return sum;
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
