package Classe_TextoseNumeros;

public class Texto {
    private String texto;

    public Texto(String texto){
        this.texto = texto;
    }

    public int tamanho(){
        return texto.length();
    }

    public String minusculo(){
        return texto.toLowerCase();
    }

    public String maiusculo(){
        return texto.toUpperCase();
    }

    public String subinicio(int n){
        return texto.substring(0,n);
    }

    public String comparador(String outra){
        int comparar = texto.compareTo(outra);

        if(comparar == 0){
            return "igual";
        }
        else if(comparar > 0){
            return "maior";
        }
        else {
            return "menor";
        }
    }

    public boolean contem(String outra){
        String textoMin = texto.toLowerCase();
        String outraMin = outra.toLowerCase();

        return textoMin.contains(outraMin);
    }

    public String juntar(String outra){
        return texto.concat(outra);
    }

    public int localizar(String outra){
        return texto.indexOf(outra);
    }
}