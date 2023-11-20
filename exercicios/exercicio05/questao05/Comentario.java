package questao05;
public class Comentario implements Publicavel{
    private DadosPostagem dadosPostagem;
    private Postagem postagemOriginal;

    public Comentario(String id, Perfil autor, Postagem postagemOriginal){
        this.dadosPostagem = new DadosPostagem(id, autor);
        this.postagemOriginal = postagemOriginal;
    }

    @Override
    public void exibir(){
        System.out.println("Comentário de " + this.dadosPostagem.getAutor().getNomeUsuario() + " em resposta a postagem [" + this.dadosPostagem.getId() + "]: " + postagemOriginal.getConteudo());
    }

    @Override
    public Perfil getAutor1() {
        return this.dadosPostagem.getAutor();
    }
}
