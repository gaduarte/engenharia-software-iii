package questao03;
public class DadosPersistencia {
    private String dados;
    private String arquivo;

    public DadosPersistencia(String dados, String arquivo){
        this.dados=dados;
        this.arquivo=arquivo;
    }

    public String getDados(){
        return dados;
    }

    public String getArquivo(){
        return arquivo;
    }
}
