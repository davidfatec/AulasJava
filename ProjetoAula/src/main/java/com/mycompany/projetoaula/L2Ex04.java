/*
Faça um algoritmo que leia duas notas, calcule a média, imprimir a média e 
"aprovado" caso a média for maior ou igual a 6 ou "reprovado" caso a média for 
menor que 6.
 */
package com.mycompany.projetoaula;
import java.util.Scanner;

public class L2Ex04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float n1 = scn.nextFloat();
        float n2 = scn.nextFloat();
        float media = (n1 + n2)/2;
        System.out.println(media);
        if(media >= 6){
            System.out.println("aprovado");
        }else{
            System.out.println("reprovado");
        }
    }
}
