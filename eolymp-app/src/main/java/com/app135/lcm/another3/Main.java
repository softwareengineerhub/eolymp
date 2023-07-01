package com.app135.lcm.another3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>(n);
        while (n > 0) {
            String text = in.next();
            list.add(Integer.parseInt(text));
            n--;
        }
        long lcm = findLCM(list);
        System.out.println(lcm);
    }

    private static long findLCM(List<Integer> list){
        return list.stream().reduce(
                1, (x, y) -> (x * y) / gcd(x, y));
    }

    static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        return gcd(b, a % b);
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
