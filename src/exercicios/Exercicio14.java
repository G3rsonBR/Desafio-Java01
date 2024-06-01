package exercicios;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = sc.nextDouble();

		if (numero < 0) {
			numero = Math.pow(numero, 2);
			System.out.println("Seu número ao quadrado é: " + numero);
		} else {
			numero = Math.sqrt(numero);
			System.out.println("A raiz do seu número é: " + numero);
		}
		
		sc.close();
	}
}