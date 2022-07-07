package com.elitesapiens.vanessa.model;

import java.util.Scanner;

public class Mat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a number of matrices: ");
        int n = scanner.nextInt();
        System.out.println();
        int[][] a = new int[n][n];

        //matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(a[i][i]);
        }

        System.out.println();

        //contar negativo
        int negative =0;
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < n) {
                if (a[i][j] < negative) {
                    negative++;
                }
                j++;
            }
        }

        System.out.println("Negatives: " + negative);

    }
}
