package exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigoProd;
		String categoriaProd;
		
		System.out.print("Digite o c�digo do produto: ");
		codigoProd = sc.nextInt();
	
		if (codigoProd >= 1 && codigoProd < 11 ) {
			categoriaProd = "Alimento n�o-perec�vel";
		}
		else if(codigoProd >= 11 && codigoProd < 21) {
			categoriaProd = "Alimento perec�vel";
		} 
		else if(codigoProd >= 21 && codigoProd < 31) {
			categoriaProd = "Vestu�rio";
		} 
		else if(codigoProd >= 31 && codigoProd < 40) {
			categoriaProd = "Eletr�nicos";
		} 		
		else {
			categoriaProd = "C�digo inv�lido";
		} 
		
		
		if (categoriaProd == "C�digo inv�lido") {
			System.out.print("N�o foi poss�vela achar a categoria do produto, " + categoriaProd);
		} else {
			System.out.print("Seu produto � da categoria: " + categoriaProd);
		}
		
		sc.close();
	}
}