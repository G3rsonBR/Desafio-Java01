package exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		char notaConceitual;
		
		System.out.print("Digite sua nota: ");
		nota = sc.nextInt();
	
		if (nota >= 9 ) {
			notaConceitual = 'A';
		}
		else if(nota >= 7 && nota < 9) {
			notaConceitual = 'B';
		} 
		else if(nota >= 5 && nota < 7) {
			notaConceitual = 'C';
		} 
		else if(nota >= 3 && nota < 5) {
			notaConceitual = 'D';
		} 
		else {
			notaConceitual = 'F';
		} 
		
		System.out.print("sua nota conceitual é: " + notaConceitual);
		
		sc.close();
	}
}