package com.app4849.swapminmax;

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

        swapMinMax(array);
        String result = java.util.Arrays.toString(array);
        System.out.println(result.substring(1, result.length() - 1).replaceAll(",", ""));

    }

    private static void swapMinMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for(int a: array){
            if(a>max){
                max = a;
            }
            if(a<min){
                min=a;
            }
        }
        for(int i=0;i<array.length;i++){
            if(array[i]==max){
                array[i]=min;
            }else if(array[i]==min){
                array[i]=max;
            }
        }
    }

}
