package questao04.validacao;
import java.util.List;

public class ValidarRendimento implements Validacao{
    private final List<Double> rendimentos;

    public ValidarRendimento(List<Double> rendimentos){
        this.rendimentos=rendimentos;
    }

    @Override
    public void validar(){
        if(rendimentos.size() > 5){
            throw new IllegalArgumentException("Não pode existir mais que 5 rendimentos");
        }
    }
}