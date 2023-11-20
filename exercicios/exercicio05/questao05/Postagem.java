package questao05;
import java.util.ArrayList;
import java.util.List;

public class Postagem implements Publicavel {
    private DadosPostagem dadosPostagem;
    private String conteudo;
    private List<Reacao> reacoes;
    private List<Comentario> comentarios;

    public Postagem(String id, Perfil autor, String conteudo) {
        this.dadosPostagem = new DadosPostagem(id, autor);
        this.conteudo = conteudo;
        this.reacoes = new ArrayList<>();
        this.comentarios = new ArrayList<>();
}

    public String getConteudo(){
        return conteudo;
    }

    public List<Reacao> getReacoes() {
        return reacoes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void adicionarReacao(Reacao reacao) {
        this.reacoes.add(reacao);
    }

    public void adicionarComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    @Override
    public void exibir() {
        System.out.println("Postagem [" + this.dadosPostagem.getId() + "] de " + this.dadosPostagem.getAutor().getNomeUsuario() +
        ": " + conteudo);
    }

    @Override
    public Perfil getAutor1() {
        return this.dadosPostagem.getAutor();
    }
}
