package Classe_Mensagem;

public class Whatsapp implements Comunicacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Whatsapp enviando mensagem: " + mensagem);
    }
}
