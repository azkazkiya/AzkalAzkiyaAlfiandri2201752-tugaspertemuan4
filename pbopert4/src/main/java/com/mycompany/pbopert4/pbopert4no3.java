/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbopert4;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class pbopert4no3 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai N yaitu antara 1-1000: ");
        int N = scanner.nextInt();


        printPola(N);

        scanner.close();
    }

    private static void printPola(int N) {
        if (N < 1 || N > 1000) {
            System.out.println("Nilai N tidak valid. Harap masukkan nilai antara 1 dan 1000.");
            return;
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
