package questao06;

import java.util.ArrayList;
import java.util.List;

public class AuditoriaFinanceiraService {
     
    public void auditoriaContaCorrente(List<ContaCorrente> contas, List<Transacao> transacoes){
        List<ContaCorrente> contaCorrenteRisco = new ArrayList<>();
        for(ContaCorrente conta : contas) {
            boolean encontrouTransacao = false;

            for(Transacao transacao: transacoes){
                if(conta.getTransacoes().equals(transacoes)){
                    encontrouTransacao = true;

                    if(conta.getSaldo() < transacao.getValor() || (conta.getSaldo() <= 0)){
                        contaCorrenteRisco.add(conta);
                    }
                }

                if(!encontrouTransacao){
                    throw new IllegalArgumentException("Transação não encontrada.");
                }

                if(!contaCorrenteRisco.isEmpty()){
                    throw new IllegalArgumentException("Conta Suspeita/em Risco: " + contaCorrenteRisco);
                }
            }
        }
    }
    
    public void auditoriaInvestimentos(List<Investimento> investimentos, List<ContaCorrente> contas){
        List<Investimento> investimentoRisco = new ArrayList<>();
        for(Investimento investimento : investimentos) {
            boolean encontrouConta = false;

            for(ContaCorrente conta: contas){
                if(investimento.getContaCorrentes().equals(contas)){
                    encontrouConta = true;

                    if(investimento.getValor() > conta.getSaldo() || (!investimento.getTipo().equals(TipoInvestimento.RENDA_FIXA) && !investimento.getTipo().equals(TipoInvestimento.RENDA_VARIAVEL))){
                        investimentoRisco.add(investimento);
                    }
                    break;
            }
            }
        if(!encontrouConta){
            throw new IllegalArgumentException("Investimento sem Conta Corrente.");
        }

        }
        if(!investimentoRisco.isEmpty()){
            throw new IllegalArgumentException("Investimentos de Risco: " + investimentoRisco);
        }
    }
    
    public void auditoriaTransacoes(List<Transacao> transacoes){
        List<Transacao> transacoesInvalidas = new ArrayList<>();

        for(Transacao transacao : transacoes) {
        if((transacao.getValor() <= 0) || (!transacao.getTipo().equals(TipoTransacao.CREDITO) && !transacao.getTipo().equals(TipoTransacao.DEBITO))){
            transacoesInvalidas.add( transacao);
        }
        }
        if(!transacoesInvalidas.isEmpty()){
            throw new IllegalArgumentException("Transações Inválidas: " + transacoesInvalidas);
        }
    }
    
}

