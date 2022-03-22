/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;

import java.util.Scanner;

/**
 *
 * @author david
 * Faça um algoritmo que receba uma matriz 3x3, imprima ela de modo correto e calcule a sua determinante: 
 * recebendo na ordem a11, a12, a13, a21, a22, a23, a31, a32, a33
 */
public class L4Ex01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int linha,coluna;
        int matriz[][] = new int[3][3];
        //recebe os dados da matriz 3x3
        
        for(linha = 0;linha < 3;linha++){
           for(coluna = 0;coluna < 3;coluna++){
               matriz[linha][coluna] = scn.nextInt();
           }
        }
        //Imprime a matriz 3x3
        
        for(linha = 0;linha < 3;linha++){
           for(coluna = 0;coluna < 3;coluna++){
               System.out.print(matriz[linha][coluna]+"\t");
           }
            System.out.println();
        }
        
        //calculo da determinante
        int determinante = 
             ((matriz[0][0] * matriz[1][1] * matriz[2][2])+
              (matriz[0][1] * matriz[1][2] * matriz[2][0])+
              (matriz[0][2] * matriz[1][0] * matriz[2][1])) -
             ((matriz[2][0] * matriz[1][1] * matriz[0][2])+
              (matriz[2][1] * matriz[1][2] * matriz[0][0])+
              (matriz[2][2] * matriz[1][0] * matriz[0][1])
        );  
        System.out.println(determinante);
    }
}
