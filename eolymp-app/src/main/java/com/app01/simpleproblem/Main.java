package com.app01.simpleproblem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String text = makeText(n);
        System.out.println(text);
    }

    private static String makeText(int n) {
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            int tmp = n % 10;
            n = n / 10;
            sb.append(tmp);
            sb.append(" ");
        }
        return sb.reverse().toString().trim();
    }


}
