package questao04;
import java.util.List;

public class ImpostoDeRenda {
    private String cpfContribuinte;
    private List<Double> rendimentos;
    private List<Double> despesas;

    public ImpostoDeRenda(String cpfContribuinte,
    List<Double> rendimentos,
    List<Double> despesas) {
        this.cpfContribuinte = cpfContribuinte;
        this.rendimentos = rendimentos;
        this.despesas = despesas;
    }
    public String getCpf(){
        return cpfContribuinte;
    }
    public List<Double> getRendimentos(){
        return rendimentos;
    }
    public List<Double> getDespesas(){
        return despesas;
    }

    public void processar(List<Validacao> validacoes) {
        for (Validacao validacao : validacoes) {
            validacao.validar();
        }

        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda();
        double impostoDevido = calculadora.calcularImposto(this);

        RelatorioImpostoRenda relatorio = new RelatorioImpostoRenda();
        relatorio.gerarRelatorio(this, impostoDevido);
    }
}
