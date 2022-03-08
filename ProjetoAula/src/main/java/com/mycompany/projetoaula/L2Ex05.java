/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;
import java.util.Scanner;
        
public class L2Ex05 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int numero = scn.nextInt();
        if(numero % 2 == 0){
            System.out.println("par");
        }else{
            System.out.println("impar");
        }
    }
}
