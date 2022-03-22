/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;

/**
 *
 * @author david
 * Elabore um algoritmo para calcular a soma dos números pares de 1000 a 10
 */
public class L3Ex07 {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 10; i <= 1000;i++){
            if(i % 2 == 0){
               soma = soma + i;
            } 
        } 
        System.out.println(soma);
    }
}
