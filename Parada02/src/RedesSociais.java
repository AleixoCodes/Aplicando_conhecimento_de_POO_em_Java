public class RedesSociais implements Comunicacao {

    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("RedesSociais enviando mensagem: " + mensagem);
    }
}
