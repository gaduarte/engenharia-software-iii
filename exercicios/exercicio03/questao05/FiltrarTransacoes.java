package questao05;
import java.util.ArrayList;
import java.util.List;

public class FiltrarTransacoes {
    private List<Transacao> transacoesInvalidas;

    public FiltrarTransacoes(List<Transacao> transacoesInvalidas){
        this.transacoesInvalidas = transacoesInvalidas;
    }

     public List<Transacao> filtrarTransacoesInvalidas() {
        List<Transacao> transacoesFiltrada = new ArrayList<>();

        for(Transacao transacao: transacoesInvalidas){
            if(condicaoParaFiltrar(transacao)){
                transacoesFiltrada.add( transacao);
            }
        }
            return transacoesInvalidas;
        }

        private boolean condicaoParaFiltrar(Transacao transacao) {
            return transacao.getValor() <= 0
                    || (!transacao.getTipo().equals(TipoTransacao.CREDITO) && !transacao.getTipo().equals(TipoTransacao.DEBITO));
        }
        
}
