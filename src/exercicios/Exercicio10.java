package exercicios;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float num1, num2, operacao = 0;
		String operador;
		
		System.out.print("Digite o primeiro número: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		System.out.print("Digite a operação (+, -, *, /): ");
		operador = sc.next();
		
	
		switch(operador) {
			case "+":
				operacao = num1 + num2;
				break;
			case "-":
				operacao = num1 - num2;
				break;
			case "*":
				operacao = num1 * num2;
				break;
			case "/":
				operacao = num1 / num2;
				break;
		}
		
		System.out.print(num1 + " " + operador + " " + num2 + " = " + operacao);
		
		sc.close();
	}
}