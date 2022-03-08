/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoaula;
import java.util.Scanner;
public class L2Ex03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int media = (a+b+c)/3;
        if ((media > a && media > b)||(media > a && media > c)||(media > c && media > b)){
            System.out.println("maior");
        }else{
            System.out.println("menor");
        }
    }
}
