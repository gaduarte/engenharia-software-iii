package SRP.conserto;
//Responsabilidade: Gerenciar comentários.

public class Comentario {
    private String mensagem;

    public Comentario(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem(){
        return mensagem;
    }

    public void comentarLivro(ClienteNovaVersao cliente){
        System.out.println("Comentário: " + mensagem + ", feito por: " + cliente.getNome());
    }
}
