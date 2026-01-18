package Classe_ManipulaTextoseNumeros;

public class Main {
    public static void main(String[] args) {
        Texto txt = new Texto("Nos Tempos da Brilhantina");

        System.out.println("Frase a ser exemplar: " + txt);
        System.out.println("Tamanho da String: " + txt.tamanho() + " Caracteres");
        System.out.println("Frase maiuscula: " + txt.maiusculo());
        System.out.println("Frase minuscula: " + txt.minusculo());
        System.out.println("Primeiros 10 caracteres: " + txt.subinicio(10));
        System.out.println("A frase: 'Programando em Java' é " + txt.comparador("Programando em Java") + " que a frase exemplar.");
        System.out.println("A palavra inserida está contida na frase? " + txt.contem("Tempo"));
        System.out.println(txt.juntar(" com Jhon Travota"));
        System.out.println(txt.localizar("Brilhantina"));
        System.out.println();

        Numero Num = new Numero(4.20, 8.7);

        System.out.println("Números escolhidos: 4.20 e 8.7");
        System.out.println("O maior: " + Num.maior());
        System.out.println("O menor: " + Num.menor());
        System.out.println("Potencia do maior: " + Num.potencia());
        System.out.println("Raiz do maior: " + Num.raiz());
        System.out.println("Logaritmo do maior: " + Num.log());
        System.out.println("Valor absoluto: " + Num.absoluto());
        System.out.println("Arredondado(para cima): " + Num.ceil());
        System.out.println("Arredondado(para baixo): " + Num.arredondar());
        System.out.println("Numero aleatorio entre os dois: " + Num.aleatorio());
        System.out.println("Seno do primeiro numero: " + Num.seno());
    }
}
