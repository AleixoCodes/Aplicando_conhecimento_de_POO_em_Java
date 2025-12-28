package Classe_Mensagem;

public class SMS implements Comunicacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("SMS enviando mensagem: " + mensagem);
    }
}
