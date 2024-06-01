package exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.print("Digite o primeiro lado do triângulo: ");
		numero1 = sc.nextInt();
		
		System.out.print("Digite o segundo lado do triângulo: ");
		numero2 = sc.nextInt();
		
		System.out.print("Digite o terceiro lado do triângulo: ");
		numero3 = sc.nextInt();
		
		if(numero1 + numero2 > numero3 && numero1 + numero3 > numero2 && numero2 + numero3 > numero1) {
			System.out.print("O Triângulo existe");
		} else {
			System.out.print("O Triângulo não existe");
		}
		
		sc.close();
	}
}