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
public class Exercicio_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o numero " + (i + 1) + " da sequencia");
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (n[i] == n[j]) {
                    System.out.println("Os valores " + n[i] + " se repete");
                }
            }
        }
        sc.close();
    }
}


