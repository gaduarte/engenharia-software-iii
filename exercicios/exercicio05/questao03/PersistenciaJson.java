package questao03;
import java.io.IOException;

public class PersistenciaJson implements Salvar{
    private DadosPersistencia dadosPersistencia;

    public PersistenciaJson(String dados, String arquivo){
        this.dadosPersistencia = new DadosPersistencia(dados, arquivo);
    }
    
    @Override
    public void salvar(String dados, String arquivo) throws IOException{
        if(!this.dadosPersistencia.getDados().startsWith("{")){
            throw new IllegalArgumentException("Dados não estão em formato JSON.");
        }
        
    }
}
