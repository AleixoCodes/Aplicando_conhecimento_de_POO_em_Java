package Classe_ManipulaTextoseNumeros;

public class Numero {
    private double num1;
    private double num2;

    public Numero(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double maior(){
        return Math.max(num1, num2);
    }

    public double menor(){
        return Math.min(num1, num2);
    }

    public double potencia(){
        return Math.pow(num1, num2);
    }

    public double raiz(){
        return Math.sqrt(num1);
    }

    public double log(){
        return Math.log(num1);
    }

    public double absoluto(){
        return Math.abs(num1);
    }

    public double ceil(){
        return Math.ceil(num1);
    }

    public long arredondar(){
        return Math.round(num1);
    }

    public double aleatorio(){
        return Math.random() * (maior() - menor()) + menor();
    }

    public double seno(){
        return Math.sin(num1);
    }
}
