package exercicios;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("O número digitado é negativo");	
		} 
		else if (numero == 0) {
			System.out.println("O número digitado é igual a zero (nulo)");	
		}
		else {
			System.out.println("O número digitado é positivo");
		}
		
		sc.close();
	}
}