/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;

import java.util.Scanner;

public class L1Ex04 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        //entrada de dados
        System.out.println("Digite o primeiro numero: ");
        int numero1 = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numero2 = scn.nextInt();
        
        //Operações
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;

        
        //Saida dos dados processados
        System.out.println("A soma de "+numero1+" e "+numero2+" é " + soma);
        System.out.println("A subtação de "+numero1+" por "+numero2+" é " + subtracao);
        System.out.println("A multiplicação de "+numero1+" por "+numero2+" é " + multiplicacao);
     
    }
}
