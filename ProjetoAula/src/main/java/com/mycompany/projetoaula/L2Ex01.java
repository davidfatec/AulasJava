/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;
import java.util.Scanner;
/**
 Faça um algoritmo que leia os valores A, B, C e imprima "maior" se a soma de A + B é menor que C, ou "menor" 
 * caso contrário.
 * @author david
 */
public class L2Ex01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        if ((a + b) < (c)){
            System.out.println("menor");
        }
        else{
            System.out.println("maior");
        }
    }
    
}
