package exercicios;

import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite um n�mero: ");
		numero = sc.nextInt();
		
		if(numero > 100) {
			System.out.print("O n�mero � maior que 100");
		}
		else {
			System.out.print("O dobro do seu n�mero �: " + (numero * 2));
		}
		
		sc.close();
	}
}