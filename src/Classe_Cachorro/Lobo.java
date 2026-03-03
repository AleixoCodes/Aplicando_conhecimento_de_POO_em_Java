package Classe_Cachorro;

public class Lobo implements Uivavel {

    private String classe;
    private String raca;
    private int idade;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
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
       System.out.println("Lobo uivando...");
    }
}