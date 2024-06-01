package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoProd;
		String categoriaProd;
		
		System.out.print("Digite o código do produto: ");
		codigoProd = sc.nextInt();
	
		if (codigoProd >= 1 && codigoProd < 11 ) {
			categoriaProd = "Alimento não-perecível";
		}
		else if(codigoProd >= 11 && codigoProd < 21) {
			categoriaProd = "Alimento perecível";
		} 
		else if(codigoProd >= 21 && codigoProd < 31) {
			categoriaProd = "Vestuário";
		} 
		else if(codigoProd >= 31 && codigoProd < 40) {
			categoriaProd = "Eletrônicos";
		} 		
		else {
			categoriaProd = "Código inválido";
		} 
		
		
		if (categoriaProd == "Código inválido") {
			System.out.print("Não foi possívela achar a categoria do produto, " + categoriaProd);
		} else {
			System.out.print("Seu produto é da categoria: " + categoriaProd);
		}
		
		sc.close();
	}
}