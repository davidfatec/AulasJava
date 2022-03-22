/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;

import java.util.Scanner;

/**
 *
 * @author david
 * Faça um algoritmo que crie uma calculadora com as quatro operações básicas 
 * (adição, subtração, multiplicação e divisão) para dois números, em que cada 
 * operação deve ser realizada por uma função. Entradas em ordem: n1, n2, 
 * operador. Saída tipo Float.
 */
public class L4Ex02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float n1 = scn.nextFloat();
        float n2 = scn.nextFloat();
        String operador = scn.next(); 
        float resultado = 0f;
        
        switch (operador)
        {
            case "+":
                resultado=adicao(n1,n2);
                break;
            case "-":
                resultado=subtracao(n1,n2);
                break;
            case "*":
                resultado=multiplicao(n1,n2);
                break;
            case "/":
                resultado=divisao(n1,n2);
                break;
        }
        System.out.println(resultado);
    } 
    
    public static float adicao(float n1,float n2){
        float resultado = n1 + n2;
        return resultado;
    }
    
    public static float subtracao(float n1,float n2){
        float resultado = n1 - n2;
        return resultado;
    }
    
    public static float multiplicao(float n1,float n2){
        float resultado = n1 * n2;
        return resultado;
    }
    
    public static float divisao(float n1,float n2){
        float resultado = n1 / n2;
        return resultado;
    }
    
}
