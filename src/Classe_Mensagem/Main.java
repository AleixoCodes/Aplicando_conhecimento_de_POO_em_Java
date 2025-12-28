package Classe_Mensagem;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua mensagem: ");
        var mensagem = scanner.nextLine();

        Comunicacao sms = new SMS();
        Comunicacao zapzap = new Whatsapp();
        Comunicacao redesSociais = new RedesSociais();
        Comunicacao email = new Email();

        List<Comunicacao> comunicacoes = List.of(sms, zapzap, email, redesSociais);

        for (Comunicacao comunicacao : comunicacoes) {
            comunicacao.enviarMensagem(mensagem);
        }

        scanner.close();
    }
}