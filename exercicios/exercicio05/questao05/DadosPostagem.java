package questao05;
public class DadosPostagem {
    private String id;
    private Perfil autor;

    public DadosPostagem(String id, Perfil autor){
        this.id=id;
        this.autor=autor;
    }

    public String getId(){
        return id;
    }

    public Perfil getAutor(){
        return autor;
    }
}
