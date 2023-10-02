package questao05;
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
    public ContaCorrente(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
  
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
}
class Investimento {
    private int id;
    private double valor;
    private TipoInvestimento tipo;
    private String statusRisco;
    public Investimento(int id, double valor, TipoInvestimento tipo, String statusRisco) {
        this.id = id;
        this.valor = valor;
        this.tipo = tipo;
        this.statusRisco=statusRisco;
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