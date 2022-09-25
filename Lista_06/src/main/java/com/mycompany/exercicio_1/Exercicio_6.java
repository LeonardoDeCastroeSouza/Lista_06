/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio_1;

import java.util.Scanner;

/**
 *
 * @author Leona
 */
public class Exercicio_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        int x = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha um numero");
            n[i] = sc.nextInt();
        }
        System.out.println("Escolha um numero x");
        x = sc.nextInt();
        int xt = 0;
        for (int i = 0; i < 10; i++) {
            if (n[i] % x == 0) {
                System.out.println("O numero " + n[i] + " é multiplo de " + x);
                xt++;
            }
        }
        System.out.println("E foram um de " + xt);
        sc.close();
    }
}
