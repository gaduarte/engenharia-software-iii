package questao05;
import java.util.Date;
import java.util.List;

public class VerificarFraude {
    public boolean verificarFraude(List<Transacao> historicoTransacoes, Transacao novaTransacao) {
        if (verificarAtividadeIncomum(historicoTransacoes, novaTransacao)) {
            return true;
        }

        return false; 
    }

    private boolean verificarAtividadeIncomum(List<Transacao> historicoTransacoes, Transacao novaTransacao) {
        long limiteTempo = 24 * 60 * 60 * 1000; 

        Date dataNovaTransacao = novaTransacao.getData();

        int transacoesRecentes = 0;
        for (Transacao transacao : historicoTransacoes) {
            if (dataNovaTransacao.getTime() - transacao.getData().getTime() <= limiteTempo) {
                transacoesRecentes++;
            }
        }
        int limiteTransacoesRecentes = 10; 

        return transacoesRecentes > limiteTransacoesRecentes;
    }

}
