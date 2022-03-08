
package com.mycompany.projetoaula;

import java.util.Scanner;


public class L1Ex05 {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.println("Multiplos de 5.");
       System.out.println("Digite o número inicial: ");
       int numeroInicio = scn.nextInt();
       System.out.println("Digite o número limite: ");
       int numeroFinal = scn.nextInt();
       System.out.println("Impressão dos multiplos de ");
       for(int i=numeroInicio;i<=numeroFinal;i++){
	    if(i % 5 == 0)
		System.out.print(i);			
       }
    }
}
