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
public class SecondQuestion {

    public static void displayUniqueArray() {
        Integer[] uniqueArr = myUniqueArray();
        System.out.println("----------------------");
        for (int i = 0; i < uniqueArr.length; i++) {
            System.out.println(uniqueArr[i]);
        }
        System.out.println("----------------------");

    }

    private static Integer[] myUniqueArray() {
        Integer[] arr = new Integer[]{2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12};
        Integer[] newArr = new Integer[arr.length];
        int count = 0;
        for (int i = 0; i < newArr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                newArr[count++] = arr[i];
            }
        }
        newArr[count++] = arr[arr.length - 1];

        Integer[] uniqueArr = new Integer[countNotNull(newArr)];
        for (int i = 0; i < uniqueArr.length; i++) {
            uniqueArr[i] = newArr[i];
        }
        return uniqueArr;

    }

    private static int countNotNull(Integer[] arr) {
        int countNotNull = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                countNotNull++;
            }
        }
        return countNotNull;

    }

}
