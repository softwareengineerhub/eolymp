package com.app02.digest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int amount = findAmountOfDigest(n);
        System.out.println(amount);
    }

    private static int findAmountOfDigest(int n){
        String s = n+"";
        return s.length();
    }



}
