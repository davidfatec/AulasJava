/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;

import java.util.Scanner;

/**
 *
 * @author david
 * Elabore um algoritmo para ler os números n e p, e calcule a exponenciação de n^p utilizando o repetidor for
 */
public class L3Ex08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int calculo = 1;
        for(int i = 1;i <= p;i++){
           calculo = calculo*n;
        }
        System.out.println(calculo);
    }
}
