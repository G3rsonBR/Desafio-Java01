package exercicios;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ano;
		
		System.out.print("Digite o ano: ");
		ano = sc.nextInt();
						
		if(ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			System.out.println("O Ano é Bissexto");
		}
		else {
			System.out.println("O Ano não é Bissexto");
		}
		
		sc.close();
	}
}