package com.app438.matrixsnake.asarray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Main snakeMatrix = new Main();
        snakeMatrix.run();

    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] box = new int[n][n];
        int count = 0;
        for (int i = 0;i<n; i++){
            if(i % 2 == 0){
                for (int j = 0;j<n; j++){
                    box [i][j] = ++count;
                }
            }else {
                for (int j = n-1;j>=0; j--){
                    box [i][j] = ++count;
                }
            }
        }
        printBox(box);
    }

    private void printBox(int [][] box) {
        for (int[] row : box) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}
