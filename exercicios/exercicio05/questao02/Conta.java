package questao02;

public class Conta {
    private DadosConta dadosConta;
    private String numeroConta;

    public Conta(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.dadosConta= new DadosConta(saldo);
        }

        public void depositar(double valor) {
           double depositoSaldo = this.dadosConta.getSaldo() + valor;
           this.dadosConta.setSaldo(depositoSaldo);
        }

        public void sacar(double valor) {
            double saldoAtual = this.dadosConta.getSaldo();

            if (valor > saldoAtual) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
            double sacarSaldo = this.dadosConta.getSaldo() - valor;
            this.dadosConta.setSaldo(sacarSaldo); 
        }

}
