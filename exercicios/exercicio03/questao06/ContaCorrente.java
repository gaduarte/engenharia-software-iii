package questao06;
import java.util.Date;
import java.util.List;

enum TipoInvestimento {
    RENDA_FIXA, RENDA_VARIAVEL
}
enum TipoTransacao {
    CREDITO, DEBITO
}
class ContaCorrente {
    private String numero;
    private double saldo;
    private List<Transacao> transacoes;
    public ContaCorrente(String numero, double saldo, List<Transacao> transacoes) {
        this.numero = numero;
        this.saldo = saldo;
        this.transacoes=transacoes;
    }
  
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public List<Transacao> getTransacoes(){
        return transacoes;
    }
}
class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private String statusRisco;
    private List<ContaCorrente> contaCorrente;
    public Investimento(int id, double valor, TipoInvestimento tipo, String statusRisco, List<ContaCorrente> contaCorrente) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.statusRisco=statusRisco;
        this.contaCorrente=contaCorrente;
    }
   
    public int getId() {
        return id;
    }
    public double getValor() {
        return valor;
    }
    public TipoInvestimento getTipo() {
        return tipo;
    }
    public String getStatusRisco(){
        return statusRisco;
    }
    public List<ContaCorrente> getContaCorrentes(){
        return contaCorrente;
    }
}
class Transacao {
    private int id;
    private double valor;
    private TipoTransacao tipo;
    private Date data;
    public Transacao(int id, double valor, TipoTransacao tipo, Date data) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.data = data;
    }
    
    public int getId() {
        return id;
    }
    public double getValor() {
        return valor;

    }
    public TipoTransacao getTipo() {
        return tipo;
    }
    public Date getData(){
        return data;
    }
    }
