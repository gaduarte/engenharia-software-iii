package questao04;
import java.util.List;

public class ValidarRendimentoDespesa implements Validacao{
    private final List<Double> rendimentos;
    private final List<Double> despesas;

    public ValidarRendimentoDespesa(List<Double> rendimentos, List<Double> despesas){
        this.rendimentos=rendimentos;
        this.despesas=despesas;
    }
    @Override
    public void validar(){
        for(Double rendimento: rendimentos){
            if(rendimento < 0){
            throw new IllegalArgumentException("Rendimentos não podem ser Negativos.");
        }
    }
        for(Double despesa: despesas){
            if(despesa < 0){
                throw new IllegalArgumentException("Despesas não podm ser Negativos.");
            }
        }
        }
        
}
