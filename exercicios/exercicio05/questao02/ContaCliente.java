package questao02;
public class ContaCliente {
    private String nome;
    private String cpf;
    private String endereco;
    private DadosConta dadosConta;

    public ContaCliente(String nome, String cpf, String endereco, double saldo) {
        this.dadosConta= new DadosConta(saldo);
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    }
