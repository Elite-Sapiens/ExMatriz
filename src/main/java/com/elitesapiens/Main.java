package com.elitesapiens;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de linhas e colunas: ");
        int n =  sc.nextInt();
        int [][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for(int x = 0; x < n; x++) {
                mat[i][x] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for (int i=0; i<mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int count = 0;
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("\nNegative numbers = " + count);

        sc.close();
    }
}