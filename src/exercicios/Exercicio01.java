package exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("O n�mero digitado � negativo");	
		} else {
			System.out.println("O n�mero digitado � positivo");
		}
		
		sc.close();
	}
}