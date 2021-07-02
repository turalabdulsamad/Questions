/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.technofusion.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author dell
 */
public class ThirdQuestion {

    public static String textGenerator() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text: ");
        String text = sc.nextLine();
        return text;
    }

    public static void calculatePercentageAndDisplay() {
        DecimalFormat df = new DecimalFormat("#.00");
        HashMap<String, Integer> hashMap = calculateCount();
        int upper = hashMap.get("upper");
        int lower = hashMap.get("lower");
        int digit = hashMap.get("digit");
        int otherChars = hashMap.get("symbol");
        double sum = upper + lower + digit + otherChars;
        
        
        String percentageUpper = df.format((upper / sum)*100);       
        String percentageLower = df.format((lower / sum)*100);
        String percentageDigit = df.format((digit / sum)*100);
        String percentageOtherChars = df.format((otherChars / sum)*100);
        System.out.println("----------------------");


        System.out.println("Number of uppercase letters is " + upper + ". So percentage is " + percentageUpper
                + "%\nNumber of lowercase letters is " + lower + ". So percentage is " + percentageLower +  
"%\nNumber of digits is "+ digit + ". So percentage is " + percentageDigit + 
"%\nNumber of other characters is "+otherChars + ". So percentage is " + percentageOtherChars+"%."

    );
        System.out.println("----------------------");
        
    }
    
    
    private static HashMap<String, Integer> calculateCount() {
        String text = textGenerator();
        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigit = 0;
        int countOtherChars = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpperCase++;
            } else if (Character.isLowerCase(c)) {
                countLowerCase++;
            } else if (Character.isDigit(c)) {
                countDigit++;
            } else if (!Character.isUpperCase(c) && !Character.isLowerCase(c) && !Character.isDigit(c)) {
                countOtherChars++;
            }
        }
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("upper", countUpperCase);
        hashMap.put("lower", countLowerCase);
        hashMap.put("digit", countDigit);
        hashMap.put("symbol", countOtherChars);

        return hashMap;
    }

}
