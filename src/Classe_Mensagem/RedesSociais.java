package Classe_Mensagem;

public class RedesSociais implements Comunicacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("MensagensSimultaneas.RedesSociais enviando mensagem: " + mensagem);
    }
}
