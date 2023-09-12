package questao07;
public class PedidoRefeito {
    private String descricao;
    private double valor;
    private EmitirNotaFiscal emitirNotaFiscal;
    
    public PedidoRefeito(String descricao, double valor, EmitirNotaFiscal emitirNotaFiscal) {
        this.descricao = descricao;
        this.valor = valor;
        this.emitirNotaFiscal = emitirNotaFiscal;
    }
    
    public double getValor() {
        return valor;
    }

    public void emitirNotaFiscal(){
        emitirNotaFiscal.registrarPedido(this);
    }

}
