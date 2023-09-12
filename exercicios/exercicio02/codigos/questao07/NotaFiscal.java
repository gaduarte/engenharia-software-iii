package questao07;

public class NotaFiscal implements EmitirNotaFiscal{

    @Override
    public void registrarPedido(PedidoRefeito pedido) {
        double valorPedido = pedido.getValor();
        System.out.println("Pedido registrado na nota fiscal. Valor: " + valorPedido);
    
}
}
