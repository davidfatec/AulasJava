/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;
import java.util.Scanner;
/**
 *
 * @author david
 * Faça um algoritmo que imprima todos os números de 1 até um número especificado 
 * pelo usuário e ao final também imprima a soma deles.
 */
public class L3Ex05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o numero final da lista: ");
        int numFinal = scn.nextInt();
        int soma = 0;
        for(int i = 1; i <= numFinal;i++){
            System.out.println(i);
            soma = soma + i;
        }
        System.out.println(soma);
    }
 
}
