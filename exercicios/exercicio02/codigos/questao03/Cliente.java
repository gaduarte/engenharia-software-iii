package questao03;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private Conta conta;
    
    public Cliente(int id, String nome, String endereco, String numeroConta, double saldo ){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.conta = new Conta(numeroConta, saldo);
    }
    
    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
    }
    
    public void realizarCompra(Compra compra) throws SaldoInsuficienteException{
      if(compra.getvalorCompra() <= 0){
        throw new IllegalArgumentException("Valor da compra deve ser maior que zero.");
      }
     if (conta.getSaldo() < compra.getvalorCompra()){
        throw new IllegalArgumentException("Saldo Insuficiente.");
     }

     conta.atualizarSaldo(compra.getvalorCompra());
     System.out.println("Compra realizada com sucesso.");
    }

    public static void main(String[] args) {
      // Exemplo de uso
      Cliente cliente = new Cliente(2, "Cliente01", "Rua A","1234", 1000.0);
      Compra compra = new Compra( 500.0);

      try {
          cliente.realizarCompra(compra);
      } catch (SaldoInsuficienteException e) {
          System.out.println("Erro ao realizar compra: " + e.getMessage());
      }

      cliente.exibirInformacoes();
  }
}
