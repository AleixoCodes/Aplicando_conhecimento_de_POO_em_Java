package Classe_Cachorro;

public class Lobo implements Uivavel {

    private String nome;
    private String raca;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void uivar() {
       System.out.println("Lobo com um uivar");
    }
}