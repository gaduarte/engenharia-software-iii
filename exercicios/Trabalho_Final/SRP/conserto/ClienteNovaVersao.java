package SRP.conserto;
//Responsabilidade: Gerenciar informações do cliente.

public class ClienteNovaVersao {
    private int id;
    private String nome;
    private double saldo;

    public ClienteNovaVersao(int id, String nome, double saldo){
        this.id = id;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void detalhesCliente(){
        System.out.println("Nome: " + nome + " Saldo: " + saldo);
    }
