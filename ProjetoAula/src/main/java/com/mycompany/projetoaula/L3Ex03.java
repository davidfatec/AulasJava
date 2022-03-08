/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;
import java.util.Scanner;
public class L3Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ni = scn.nextInt();
        int nf = scn.nextInt();
        int soma = ni;
        for(int i=ni;i<nf;i++){
            soma = soma + i+1;
        }
        System.out.println(soma);
    }
}
