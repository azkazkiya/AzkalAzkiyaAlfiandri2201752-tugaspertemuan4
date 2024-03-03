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
public class pbopert4no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int btsAwal = scanner.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int btsAkhir = scanner.nextInt();

        if (btsAwal < 1 || btsAkhir > 100 || btsAwal > btsAkhir) {
            System.out.println("Input tidak valid. Pastikan batasAwal >= 1, batasAkhir <= 100, dan batasAwal <= batasAkhir.");
        } else {
            System.out.println("Bilangan prima di antara " + btsAwal + " dan " + btsAkhir + " adalah:");
            for (int i = btsAwal; i <= btsAkhir; i++) {
                if (isPrima(i)) {
                    System.out.print(i + " ");
                }
            }

            System.out.println("\nBilangan komposit di antara " + btsAwal + " dan " + btsAkhir + " adalah:");
            for (int i = btsAwal; i <= btsAkhir; i++) {
                if (!isPrima(i)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

    private static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
