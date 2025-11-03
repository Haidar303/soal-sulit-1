/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nilairatarata;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class NilaiRataRata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai ujian pertama: ");
        double nilai1 = input.nextDouble();
        System.out.print("Masukkan nilai ujian kedua: ");
        double nilai2 = input.nextDouble();
        System.out.print("Masukkan nilai ujian ketiga: ");
        double nilai3 = input.nextDouble();
        double rataRata = (nilai1 + nilai2 + nilai3) / 3;
        System.out.println("Nilai rata-rata = " + rataRata);
        }
    }
