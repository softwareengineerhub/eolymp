package com.app135.lcm.another;

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
        //int gcd = findGCD(array);
        int lcm = findLCM(array);
        System.out.println(lcm);
    }

    private static int findLCM(int[] array){
        if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        //long lcm = array[0]*array[1]/gcd;
        int gcd = findGCD(array[0], array[1]);
        int lcm = array[0]*array[1]/gcd;
        for(int i=2;i<array.length;i++){
            gcd = findGCD(lcm, array[i]);
            //long tmp = array[0]*array[1]/gcd;
            lcm=lcm*(array[i]/gcd);
        }
        return lcm;
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
