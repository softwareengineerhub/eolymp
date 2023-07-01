package com.app438.matrixsnake;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        moveAsSnake(n);
    }

    private static void moveAsSnake(int n) {
        int currentValue = 0;
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(++currentValue);
                if (j < n - 1) {
                    sb.append(" ");
                }
            }
            if ((i + 2) % 2 == 0) {
                System.out.println(sb);
            } else {
                System.out.println(sb.reverse());
            }
        }
    }

}
