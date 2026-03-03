package Classe_Cachorro;

public class TesteCachorro {
    public static void main (String[] args) {

        var lobo = new Lobo();
        Cachorro meuCachorro = new Cachorro();

        TesteCachorro.teste(lobo);
        TesteCachorro.teste(meuCachorro);

        meuCachorro.setNome("Bidu");
        meuCachorro.setRaca("Labrador");
        meuCachorro.setIdade(7);
        
        System.out.println("-----Dados do meu dog-----");
        System.out.println("Nome: " + meuCachorro.getNome());
        System.out.println("Raca: " + meuCachorro.getRaca());
        System.out.println("Idade: " + meuCachorro.getIdade() + " anos");


        lobo.setClasse("Alfa");
        lobo.setRaca("Lobo das neves");
        lobo.setIdade(8);

        System.out.println("-----Dados do lobo-----");
        System.out.println("Classe social: " + lobo.getClasse());
        System.out.println("Raca: " + lobo.getRaca());
        System.out.println("Idade: " + lobo.getIdade() + " anos");
    }
    public static void teste(Uivavel uivavel) {
        uivavel.uivar();
    }
}