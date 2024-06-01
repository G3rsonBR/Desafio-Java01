package exercicios;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int id;
		float desconto = 0f, compra = 0f;
		
		System.out.print("Digite o valor da compra: ");
		compra = sc.nextInt();
		
		System.out.println("Segunda a seguinte tabela, digite seu nível de cliente");
		System.out.println("1 - Comum");
		System.out.println("2 - Associado");
		System.out.println("3 - Vip");
		System.out.print("Digite agora: ");
		id = sc.nextInt();
		
		switch(id) {
			case 2:
				desconto = 0.10f;
				break;
			case 3:
				desconto = 0.20f;
				break;
		}
		
		compra = compra - (compra * desconto);
		
		System.out.println("O valor final da sua compra é de: " + compra);
		System.out.println("Desconto de: " + (desconto * 100) + "%");
		
		sc.close();
	}
}