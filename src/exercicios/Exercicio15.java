package exercicios;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso em kg: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura em metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        String categoria;
        if (imc < 18.5) {
            categoria = "Abaixo do peso";
        } else if (imc < 24.9) {
            categoria = "Peso normal";
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
        } else if (imc < 34.9) {
            categoria = "Obesidade grau I";
        } else if (imc < 39.9) {
            categoria = "Obesidade grau II";
        } else {
            categoria = "Obesidade grau III";
        }

        System.out.println("Seu IMC é: " + imc);
        System.out.println("Categoria: " + categoria);
        
        sc.close();
    }
}