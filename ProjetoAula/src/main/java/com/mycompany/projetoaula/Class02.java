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
public class Class02 {
    public static void main(String[] args){
        //entrada de dados 
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        
        int soma = num1 + num2;
        System.out.println("Soma: " + soma);
    }
    
}
