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
public class L1Ex04b {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.println("Soma de numeros entre inicial e final.");
       System.out.println("Digite o número inicial: ");
       int numeroInicio = scn.nextInt();
       System.out.println("Digite o número final: ");
       int numeroFinal = scn.nextInt();
       System.out.println("Impressão dos multiplos de ");
       for(int i=numeroInicio;i<numeroFinal;i++){
	   int soma = numeroInicio + i;
       		System.out.print(soma);	
       }
       
    }
}
