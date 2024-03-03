/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbopert4;
import java.util.Scanner;
/**
 *
 * @author azkiy
 */
public class Pbopert4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan tiga bilangan bulat:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

  
        boolean isThousand = checkIfThousands(num1, num2, num3);

        if (isThousand) {
            System.out.println("Semua bilangan adalah ribuan.");
        } else {
            System.out.println("Tidak semua bilangan adalah ribuan.");
        }

        scanner.close();
    }

    private static boolean checkIfThousands(int num1, int num2, int num3) {
        return (num1 >= 1000 && num1 < 10000) &&
               (num2 >= 1000 && num2 < 10000) &&
               (num3 >= 1000 && num3 < 10000);
    }
}
