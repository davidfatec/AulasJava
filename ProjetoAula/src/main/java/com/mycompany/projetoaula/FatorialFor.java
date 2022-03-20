
package com.mycompany.projetoaula;
import java.util.Scanner;
/**
 *
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
