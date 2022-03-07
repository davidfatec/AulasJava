/*Faça um algoritmo para imprimir os múltiplos de 5 em um intervalo informado pelo usuário. Ex: Entrada: 1 30 saída: 5 10 15 20 25 30*/
package exercicios;
import java.util.Scanner;
/**
 *
 * @author david
 */
public class Exercicio5 {
    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       System.out.println("Multiplos de 5.");
       System.out.println("Digite o número inicial: ");
       int numeroInicio = scn.nextInt();
       System.out.println("Digite o número limite: ");
       int numeroFinal = scn.nextInt();
       System.out.println("Impressão dos multiplos de ");
       for(int i=numeroInicio;i<=numeroFinal;i++){//todos os números inteiros de 0 a 100
		if(i % 5 == 0)//o simbolo % tem como resultado o resto da divisão entre 2 números, neste caso i/3
			System.out.println(i);			
	}
    }
}
