package questao03;
import java.io.FileWriter;
import java.io.IOException;

public class Persistencia implements Salvar {
    private DadosPersistencia dadosPersistencia;

    public Persistencia(String dados, String arquivo){
        this.dadosPersistencia = new DadosPersistencia(dados, arquivo);
    }

    @Override
    public void salvar(String dados, String arquivo) throws IOException{
        try(FileWriter writer = new FileWriter(this.dadosPersistencia.getArquivo())){
            writer.write(this.dadosPersistencia.getDados());
        }
    }
}
