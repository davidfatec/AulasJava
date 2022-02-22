/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;
import java.util.Scanner;

/**
 *
 * @author David Francisco
 */
public class Class02 {
    public static void main(String[] args){
        //instanciando 
        Scanner sc = new Scanner(System.in);
        
        //entrada de dados 
        System.out.println("Entre com o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Entre com o segundo numero: ");
        int num2 = sc.nextInt();
        
        //processamento
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        
        //Saída de dado
        System.out.println("Soma: " + soma);
    }
    
}
