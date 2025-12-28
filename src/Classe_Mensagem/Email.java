package Classe_Mensagem;

public class Email implements Comunicacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("MensagensSimultaneas.Email enviando mensagem: " + mensagem);
    }
}
