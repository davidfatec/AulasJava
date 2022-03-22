
package com.mycompany.projetoaula;
import java.util.Scanner;
/**
 *Faça um exercício que receba um número (long) e use um método para fazer o 
 * fatorial de número. Ex: 6! = 65432*1 = 720 saída long resultado.
 * @author david
 */
public class FatorialFor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long numero = scn.nextLong();
        long fat = 1;
        long i;
        for(i = numero;i>=1;i--){
            fat = fat * i;
        }
        System.out.println(fat);
    }
}
