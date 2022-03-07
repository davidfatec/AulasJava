/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class L1Ex02 {
    public static void main(String[] args){
        //instancia
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int valor1 = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        int valor2 = scn.nextInt();
        
        int aux = valor1;
        valor1 = valor2;
        valor2 = aux;
        
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
}
