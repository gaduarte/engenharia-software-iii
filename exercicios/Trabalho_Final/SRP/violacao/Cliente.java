package SRP.violacao;


import java.time.LocalDate;

import javax.xml.crypto.Data;

public class Cliente {
    private int id;
    private String nome;
    private String descricao;
    private double valor;
    private double saldo;
    private String nomeLivro;
    private String mensagem;
    private LocalDate dataDevolucao;
    private Boolean status;

    public Cliente(int id, String nome, String descricao, double valor, double saldo, String nomeLivro, String mensagem, LocalDate dataDevolucao, Boolean status){
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.saldo = saldo;
        this.nomeLivro = nomeLivro;
        this.mensagem = mensagem;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }


    public void realizarEmprestimodeLivro(){
        if(valor > 0){
            if(valor <= saldo){
                saldo -= valor;
            }else {
                throw new IllegalStateException("Saldo insuficiente para realizar a agendamento.");
            }
        }else {
            throw new IllegalArgumentException("O valor do agendamento deve ser maior que zero.");
        }
    }

    public void renovarEmprestimo(){
        if( LocalDate.now().isBefore(dataDevolucao)){
            System.out.println("Precisa devolver ou renovar empréstimo imediatamente");
            dataDevolucao = dataDevolucao.plusDays(7);
        }else{
            throw new IllegalArgumentException("Livro já devolvido ou empréstimo expirado");
        }
    }

    public void devolverLivro() {
        if (LocalDate.now().isAfter(dataDevolucao)) {
            System.out.println("Livro devolvido com atraso. Serão aplicadas penalidades.");
        } else {
            System.out.println("Devolução realizada com sucesso!");
        }
    }

    public void verificarStatusEmprestimo(){
        if(status){
            System.out.println("Livro ainda está sendo emprestado");
        }else{
            System.out.println("Livro já devolvido");
        }
    }

    public String informacoesEmprestimo() {
        StringBuilder info = new StringBuilder();
        info.append("Nome do Livro: ").append(nomeLivro).append("\n");
        info.append("Data de Devolução: ").append(dataDevolucao).append("\n");
        info.append("Status do Empréstimo: ").append(status ? "Ativo" : "Devolvido").append("\n");
        return info.toString();
    }

    public void detalhesLivro(){
        System.out.println("Nome: " + nomeLivro + " - Descrição: " + descricao + " - Valor: " + valor);
    }

    public void comentarLivro(){
        System.out.println("Comentário: " + mensagem);
    }

    public void detalhesCliente(){
        System.out.println("Nome: " + nome + " - Saldo: " + saldo);
    }
}
