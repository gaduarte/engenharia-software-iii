package questao05;
public class Reacao implements Publicavel{
    private DadosPostagem dadosPostagem;
    private String tipoReacao;

    public Reacao(String id, Perfil autor, String tipoReacao){
        this.dadosPostagem = new DadosPostagem(id, autor);
        this.tipoReacao = tipoReacao;
    }

    @Override
    public void exibir(){
        System.out.println("Reação: " + tipoReacao + " de " + this.dadosPostagem.getAutor().getNomeUsuario() + " na postagem " + this.dadosPostagem.getId());
    }

    @Override
    public Perfil getAutor1() {
        return this.dadosPostagem.getAutor();
    }
}
