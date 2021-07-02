/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technofusion.utils;

import java.util.Scanner;

/**
 *
 * @author dell
 */
public class Menu {

    public static void menu() {
        System.out.println("Hello!");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose a question!");
            System.out.println("1. Write a program to find the sum of the first 1000 prime numbers.");
            System.out.println("2. Write a program to remove duplicate elements and return new array without any duplicate elements.");
            System.out.println("3.Write a program to find the percentage of uppercase letters, lowercase letters, digits and other\n"
                    + " special characters(including space) in the given string.");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    FirstQuestion.displaySum();
                    break;
                case 2:
                    SecondQuestion.displayUniqueArray();
                    break;
                case 3:
                    ThirdQuestion.calculatePercentageAndDisplay();
                    break;
                default:
                    continue;
            }

        }
    }
}
