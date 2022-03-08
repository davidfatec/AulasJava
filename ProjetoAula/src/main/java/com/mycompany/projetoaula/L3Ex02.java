/*
Faça um algoritmo que receba o nome e um numero (nx). E imprima o nome dado um 
número de vezes determinado pelo usuário (nx vezes).
 */
package com.mycompany.projetoaula;

import java.util.Scanner;


public class L3Ex02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nome = scn.next();
        int numeroVezes = scn.nextInt();
        for(int i=1;i<=numeroVezes;i++){
            System.out.println(nome);
        }           
    }
}
