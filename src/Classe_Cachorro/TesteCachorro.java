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
        System.out.println("nome: " + meuCachorro.getNome());
        System.out.println("Raca: " + meuCachorro.getRaca());
        System.out.println("Idade" + meuCachorro.getIdade() + "anos.");

    }
    public static void teste(Uivavel uivavel) {
        uivavel.uivar();
    }
}