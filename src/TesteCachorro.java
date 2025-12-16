public class TesteCachorro {
    public static void main (String[] args) {
        Cachorro meuCachorro = new Cachorro();
        
        meuCachorro.setNome("Bidu");
        meuCachorro.setRaca("Labrador");
        meuCachorro.setIdade(7);
        
        System.out.println("-----Dados do meu dog-----");
        System.out.println("nome: " + meuCachorro.getNome());
        System.out.println("Raca: " + meuCachorro.getRaca());
        System.out.println("Idade" + meuCachorro.getIdade() + "anos.");
    }
}