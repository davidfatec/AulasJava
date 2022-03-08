/*
 Faça um algoritmo que entre com o seu nome e imprima 10 vezes o nome dado.
 */
package com.mycompany.projetoaula;
import java.util.Scanner;

public class L3Ex01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String nome = scn.next();
        for(int i=1;i<10;i++){
            System.out.println(nome);
        }           
    }
}
