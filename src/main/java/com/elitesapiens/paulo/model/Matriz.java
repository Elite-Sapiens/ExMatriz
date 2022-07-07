package com.elitesapiens.paulo.model;

import lombok.Cleanup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        @Cleanup Scanner sc = new Scanner(System.in);

        var matrizSize = sc.nextInt();
        int[][] matriz = new int[matrizSize][matrizSize];

        for (var i = 0; i < matrizSize; i++) {
            for (var j = 0; j < matrizSize; j++) {
                matriz[i][j] =sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: " + mainDiagonal(matriz));
        System.out.println("Negative Numbers: " + negativeNumbers(matriz));

    }

    public static List<Integer> mainDiagonal(int[][] matriz) {
        List<Integer> diagonal = new ArrayList<>();

        for (var i = 0; i < matriz.length; i++) {
            for (var j = 0; j < matriz.length; j++) {
                if (i == j) {
                    diagonal.add(matriz[i][j]);
                }
            }
        }

        return diagonal;
    }

    public static Integer negativeNumbers(int[][] matriz) {
        List<Integer> negativeNumbers = new ArrayList<>();

        for (int[] ints : matriz) {
            for (var j = 0; j < matriz.length; j++) {
                if (ints[j] < 0) {
                    negativeNumbers.add(ints[j]);
                }
            }
        }

        return negativeNumbers.size();
    }
}
