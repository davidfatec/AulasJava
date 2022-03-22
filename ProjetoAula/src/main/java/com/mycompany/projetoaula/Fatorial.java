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
public class Fatorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long fat = fatorial(n);
        System.out.println(fat);
    }
    //
    public static long fatorial(long n){
        if (n==1){
            return 1;
        }else{
            return n*fatorial(n-1);
        }
    }
    
}
