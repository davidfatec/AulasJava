/*
Faça um algoritmo para ler quatro notas e imprimir a média ponderada dessas 
notas. Considere que os pesos das notas são: 1,2,3 e 4 respectivamente.
*/
package exercicios;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Exercicio3 {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.println("Nota 1: ");
       float n1 = scn.nextFloat();
       System.out.println("Nota 2: ");
       float n2 = scn.nextFloat();
       System.out.println("Nota 3: ");
       float n3 = scn.nextFloat();
       System.out.println("Nota 4: ");
       float n4 = scn.nextFloat();
       
       float media = (((n1*1)+ (n2*2)+(n3*3)+(n4*4))/10);
       
       System.out.println("media ponderada: " + media);
    }
}
