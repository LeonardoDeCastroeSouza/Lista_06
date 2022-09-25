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
public class Exercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Escolha um numero");
            n[i] = sc.nextInt();
        }
        int op = 1;
        while (op != 0) {
            System.out.println("\n" + "1-Ordem normal" + "\n" + "2-Ordem inversa" + "\n" + "0-Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    for (int i = 0; i < 5; i++) {
                        System.out.print(n[i]);
                    }
                    break;
                case 2:
                    for (int i = 4; i >= 0; i--) {
                        System.out.print(n[i]);
                    }
                    break;
                case 0:
                    System.out.println("Encerrado");
                    break;
                default:
                    System.out.println("Erro opcao invalida");
                    break;
            }
        }
        sc.close();
    }
}
