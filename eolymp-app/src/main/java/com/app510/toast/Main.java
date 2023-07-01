package com.app510.toast;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int time = findTime(n, k);
        System.out.println(time);
    }

    private static int findTime(int n, int panCapacity) {
        int time = 0;
        if(n==0){
            return 0;
        }
        if (n <= panCapacity) {
            time = 4;
        } else {
            int fullPanCount = n / panCapacity;
            int mod = n % panCapacity;
            if (mod == 0) {
                time = fullPanCount * 2 * 2;
            } else {
                fullPanCount--;
                time = 6+fullPanCount * 2 * 2;
            }
        }
        return time;
    }
}
