package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite o número: ");
		numero = sc.nextInt();
		
		if(numero >=10 && numero <= 20) {
			System.out.print("O número está no intervalo permitido (10 ~ 20)");
		}
		else {
			System.out.print("O número não está no intervalo permitido (10 ~ 20)");
		}
		
		sc.close();
	}
}