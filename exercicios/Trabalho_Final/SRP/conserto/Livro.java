package SRP.conserto;
// Responsabilidade: Gerenciar informações de livros.

public class Livro {
    private String nomeLivro;
    private double valor;
    private String descricao;

    public Livro(String nomeLivro, double valor, String descricao){
        this.nomeLivro = nomeLivro;
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getNome(){
        return nomeLivro;
    }
    public double getValor(){
        return valor;
    }
    public String getDescricao(){
        return descricao;
    }

    public void detalhesLivro(){
        System.out.println("Nome: " + nomeLivro + " Descrição: " + descricao + " Valor: " + valor);
    }
}
