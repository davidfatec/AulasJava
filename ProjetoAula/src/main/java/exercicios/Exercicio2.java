/*
Faça um algoritmo para ler um valor e fazer a troca dos valores digitados pelo 
usuário. Após a troca, imprima os novos valores obtidos.
*/
package exercicios;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Exercicio2 {
    public static void main(String[] args){
        //instancia
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int valor1 = scn.nextInt();
        System.out.println("Digite o segundo numero: ");
        int valor2 = scn.nextInt();
        
        int aux = valor1;
        valor1 = valor2;
        valor2 = aux;
        
        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }
    
}
