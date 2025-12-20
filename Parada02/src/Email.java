public class Email implements Comunicacao {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Email enviando mensagem: " + mensagem);
    }
}
