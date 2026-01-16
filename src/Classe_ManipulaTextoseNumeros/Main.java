package Classe_ManipulaTextoseNumeros;

public class Main {
    public static void main(String[] args) {
        Texto txt = new Texto("Nos Tempos da Brilhantina");

        System.out.println(txt.tamanho());
        System.out.println(txt.maiusculo());
        System.out.println(txt.minusculo());
        System.out.println(txt.subinicio(10));
        System.out.println(txt.comparador("Programando em Java"));
        System.out.println(txt.contem("Tempo"));
        System.out.println(txt.juntar(" com Jhon Travota"));
        System.out.println(txt.localizar("Brilhantina"));

        Numero nums = new Numero(4.20, 8.7);

        System.out.println(nums.maior());
        System.out.println(nums.menor());
        System.out.println(nums.potencia());
        System.out.println(nums.raiz());
        System.out.println(nums.absoluto());
        System.out.println(nums.ceil());
        System.out.println(nums.arredondar());
        System.out.println(nums.aleatorio());
        System.out.println(nums.seno());

    }
}
