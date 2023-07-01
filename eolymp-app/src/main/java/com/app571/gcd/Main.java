package com.app571.gcd;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (n > 0) {
            String text = in.next();
            array[i++] = Integer.parseInt(text);
            n--;
        }
        int result = findGCD(array);
        System.out.println(result);
    }

    private static int findGCD(int[] array) {
        if(array.length==0){
            return 1;
        }
        if(array.length==1){
            return array[0];
        }

        int gcd = findGCD(array[0], array[1]);
        for (int i = 2; i < array.length; i++) {
            gcd = findGCD(gcd, array[i]);
            if(gcd==1){
                return 1;
            }
        }
        return gcd;
    }

    private static int findGCD(int a, int b) {
        if(b==1 || a==1){
            return 1;
        }
        if(b>a){
            int tmp = a;
            a = b;
            b = tmp;
        }

        int mod = a % b;
        if (mod == 0) {
            return b;
        }
        return findGCD(b, mod);
    }

}
