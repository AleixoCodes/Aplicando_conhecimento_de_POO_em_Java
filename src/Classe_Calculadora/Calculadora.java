package Classe_Calculadora;

public class Calculadora {

    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }
    
    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }
    
    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }
    
    public double dividir(double valor1, double valor2) {
        if (valor2 == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
            return 0;
        }
        return valor1 / valor2;
    }
}