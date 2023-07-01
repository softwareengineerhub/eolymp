package com.app10.gardener;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int treesCount = in.nextInt();
        int amount = findAmountOfDays(treesCount);
        System.out.println(amount);
    }

    private static int findAmountOfDays(int treesCount) {
        double volumeOfWater = 0;
        int tmp = treesCount;
        int k = 0;
        while (true) {
            volumeOfWater += 1.0 / tmp;
            if (volumeOfWater > 0.5) {
                break;
            }
            k++;
            tmp--;
        }
        return treesCount - k;
    }


}
