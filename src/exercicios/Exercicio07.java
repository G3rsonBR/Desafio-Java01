package exercicios;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();
	
		if (idade == 0 ) {
			System.out.println("Recem nascido");
		}
		else if(idade > 0 && idade <= 12) {
			System.out.println("Criança");
		} 
		else if(idade > 12 && idade <= 17) {
			System.out.println("Adolescente");
		} 
		else if(idade > 17 && idade <= 59) {
			System.out.println("Adulto");
		} 
		else if(idade > 59) {
			System.out.println("Idoso");
		} 
		else {
			System.out.println("Idade não possível");
		} 
		
		sc.close();
	}
}