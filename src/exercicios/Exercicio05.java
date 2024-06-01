package exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		float media;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextInt();
		
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextInt();
		
		System.out.print("Digite a terceira nota: ");
		nota3 = sc.nextInt();
		
		media = (nota1 + nota2 + nota3) / 3 ;
		
		System.out.println("Média: " + media);
		
		if(media >= 7) {
			System.out.println("Aprovado");
		} 
		else if(media >= 5 && media < 7) {
			System.out.println("Recuperação");
		}
		else {
			System.out.println("Reprovado");
		}
		
		sc.close();
	}
}