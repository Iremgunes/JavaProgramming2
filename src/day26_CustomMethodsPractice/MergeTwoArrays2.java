package day26_CustomMethodsPractice;


import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};

        int[] a2 = {4,5,6,7,8};

        int[] merge = merge(a1, a2);

        System.out.println(Arrays.toString(merge));
    }

    public static int[] merge(int[]arr1, int[] arr2){
       int[] result = {};


        for (int each: arr1 ) {
            result = ArraysUtility.addElement(result, each);

        }

        for (int each : arr2 ) {
            result = ArraysUtility.addElement(result, each);

        }

         return result;
    }

    public static double[] merge(double[]arr1, double[] arr2){
        double[] result = {};


        for (double each: arr1 ) {
            result = ArraysUtility.addElement(result, each);

        }

        for (double each : arr2 ) {
            result = ArraysUtility.addElement(result, each);

        }

        return result;
    }

    public static char[] merge(char[]arr1, char[] arr2){
        char[] result = {};


        for (char each: arr1 ) {
            result = ArraysUtility.addElement(result, each);

        }

        for (char each : arr2 ) {
            result = ArraysUtility.addElement(result, each);

        }

        return result;
    }

    public static String[] merge(String[]arr1, String[] arr2){
        String[] result = {};


        for (String each: arr1 ) {
            result = ArraysUtility.addElement(result, each);

        }

        for (String each : arr2 ) {
            result = ArraysUtility.addElement(result, each);

        }

        return result;
    }
}
