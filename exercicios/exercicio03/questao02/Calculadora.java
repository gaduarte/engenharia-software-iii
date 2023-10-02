package questao02;
import java.util.List;
import java.util.ArrayList;

public class Calculadora {
    private final double a;
    private final double b;
    public Calculadora(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public List<Double> calcula (List<Operacao> operacoes) {
    List<Double> resultados = new ArrayList<>();
        for(Operacao operacao: operacoes){
            resultados.add(operacao.executar(this.a, this.b));
        }
        return resultados;
    }
}
