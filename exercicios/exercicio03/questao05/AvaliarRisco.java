package questao05;

public class AvaliarRisco {
     public String avaliarRisco(Investimento investimento, ContaCorrente conta) {
        double saldo = conta.getSaldo();
        double valorInvestimento = investimento.getValor();
        double limiteInvestimento = 0.2;

        if(valorInvestimento > saldo * (1+limiteInvestimento)){
            return "Alto Risco de Investimento";
        }
        return investimento.getStatusRisco();
    }
}
