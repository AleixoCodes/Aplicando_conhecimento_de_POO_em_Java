package Classe_Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora minhaCalc = new Calculadora();
        
        System.out.println("--- Testando a Classe_Calculadora.Calculadora ---");
        
        double resultadoSoma = minhaCalc.somar(10.5, 5.5);
        System.out.println("Soma (10.5 + 5.5): " + resultadoSoma);
        
        double resultadoSub = minhaCalc.subtrair(100, 45);
        System.out.println("Subtração (100 - 45): " + resultadoSub);
        
        double resultadoMult = minhaCalc.multiplicar(7, 6);
        System.out.println("Multiplicação (7 * 6): " + resultadoMult);
        
        double resultadoDiv = minhaCalc.dividir(50, 4);
        System.out.println("Divisão (50 / 4): " + resultadoDiv);

        double resultadoDivErro = minhaCalc.dividir(10, 0);
        System.out.println("Divisão por zero (10 / 0): " + resultadoDivErro);
    }
}