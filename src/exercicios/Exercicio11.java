package exercicios;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Digite o n�mero: ");
		numero = sc.nextInt();
		
		if(numero >=10 && numero <= 20) {
			System.out.print("O n�mero est� no intervalo permitido (10 ~ 20)");
		}
		else {
			System.out.print("O n�mero n�o est� no intervalo permitido (10 ~ 20)");
		}
		
		sc.close();
	}
}