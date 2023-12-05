

import java.time.LocalDate;

public class Emprestimo {
    private LocalDate dataDevolucao;
    private Boolean status;

    public Emprestimo(LocalDate dataDevolucao, Boolean status){
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    public LocalDate getDate(){
        return dataDevolucao;
    }
    public Boolean getStatus(){
        return status;
    }

    public void setDate(LocalDate dataDevolucao){
        this.dataDevolucao = dataDevolucao;
    }
     public void setStatus(Boolean status){
        this.status = status;
    }

    public void realizarEmprestimodeLivro(ClienteNovaVersao cliente, Livro livro){
        if(livro.getValor() > 0){
            if(livro.getValor() <= cliente.getSaldo()){
                cliente.setSaldo(cliente.getSaldo() - livro.getValor());
            }else {
                throw new IllegalStateException("Saldo insuficiente para realizar a agendamento.");
            }
        }else {
            throw new IllegalArgumentException("O valor do agendamento deve ser maior que zero.");
        }
    }

    public void verificarStatusEmprestimo(){
        if(status){
            System.out.println("Livro ainda está sendo emprestado");
        }else{
            System.out.println("Livro já devolvido");
        }
    }

    public String informacoesEmprestimo(Livro livro) {
        StringBuilder info = new StringBuilder();
        info.append("Nome do Livro: ").append(livro.getNome()).append("\n");
        info.append("Data de Devolução: ").append(dataDevolucao).append("\n");
        info.append("Status do Empréstimo: ").append(status ? "Ativo" : "Devolvido").append("\n");
        return info.toString();
    }
}
