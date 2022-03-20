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
public class FatorialWhile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        long numero = scn.nextLong();
        long fat = 1;
        long contador = numero;
        while(contador >= 1){
          fat = fat * contador;
          contador--;
        }
        System.out.println(fat);
    }
}
