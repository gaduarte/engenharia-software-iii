package questao04;
import java.util.List;

public class ValidarImpostoDerenda {
    private final List<Validacao> validacoes;

    public ValidarImpostoDerenda(List<Validacao> validacoes){
        this.validacoes=validacoes;
    }

    public void processarValidacoes(){
        for(Validacao validacao: validacoes){
            validacao.validar();
        }
    }
}
