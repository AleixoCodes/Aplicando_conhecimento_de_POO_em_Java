package Classe_Calculadora;

import java.util.Scanner;

public class TesteCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora minhaCalc = new Calculadora();

        System.out.println("--- Testando a Calculadora ---");

        System.out.println("Escolha o tipo de operação a ser executado:('+'|'-'|'*'|'/'");
        String Escolha = scanner.next();

        System.out.println("Escolha o primeiro numero:");
        double primeiroNum = scanner.nextDouble();

        System.out.println("Escolha o segundo numero:");
        double segundoNum = scanner.nextDouble();

        while (!Escolha.equalsIgnoreCase("sair")) {
            switch (Escolha) {
            case "+" -> System.out.println(minhaCalc.somar(primeiroNum, segundoNum));
            case "-" -> System.out.println(minhaCalc.subtrair(primeiroNum, segundoNum));
            case "*" -> System.out.println(minhaCalc.multiplicar(primeiroNum, segundoNum));
            case "/" -> System.out.println(minhaCalc.dividir(primeiroNum, segundoNum));
            default -> System.out.println("Operação invalida. Escreva apenas as opções exibidas.");
            }
        }
    }
}