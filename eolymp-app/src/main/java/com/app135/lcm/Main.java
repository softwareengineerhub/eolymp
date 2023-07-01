package com.app135.lcm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long res = 1;
        for(int i=0;i<21;i++){
            res=res*99;
        }
        System.out.println("res="+res);

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int i = 0;
        while (n > 0) {
            String text = in.next();
            array[i++] = Integer.parseInt(text);
            n--;
        }
        int gcd = findGCD(array);
        long lcm = findLCM(array, gcd);
        System.out.println(lcm);
    }

    private static long findLCM(int[] array, int gcd){
        if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        long lcm = array[0]*array[1]/gcd;
        for(int i=2;i<array.length;i++){
            lcm=lcm*(array[i]/gcd);
        }
        return lcm;
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
