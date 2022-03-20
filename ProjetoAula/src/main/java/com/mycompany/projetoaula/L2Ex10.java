/*
Faça um algoritmo para calcular o valor da conta de água, considerando a seguinte
tabela de gastos: |M3 entre 0 – 10 -->Cada M3--> R$ 1,20| 
M3 entre 11 – 20 -->Cada M3--> R$ 1,50| 
M3 Acima de 20 -->Cada M3--> R$ 2,00|
 */
package com.mycompany.projetoaula;
import java.util.Scanner;
public class L2Ex10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float m3 = scn.nextFloat();
        float conta = 0.0f;
        if(m3 > 0 && m3 <= 10){
            conta = m3 * 1.2f;
            System.out.println((float)conta);
        }else if(m3 >= 11 && m3 <= 20){
            conta = m3 * 1.5f;
            System.out.println((float)conta);
        }else{
            conta = m3 * 2f;
            System.out.println((float)conta);
        }  
    }
}
