package exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.print("Digite um n�mero: ");
		numero1 = sc.nextInt();
		
		System.out.print("Digite outro n�mero: ");
		numero2 = sc.nextInt();
		
		if(numero1 > numero2) {
			System.out.print("O maior n�mero digitado �: " + numero1);
		} else {
			System.out.print("O maior n�mero digitado �: " + numero2);
		}
		
		sc.close();
	}
}