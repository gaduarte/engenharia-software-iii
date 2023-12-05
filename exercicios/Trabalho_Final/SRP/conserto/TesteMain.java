package SRP.conserto;
import java.time.LocalDate;

public class TesteMain {
    public static void main(String[] args) {
        LocalDate dataDevolucao = LocalDate.of(2023, 12, 6);

        ClienteNovaVersao cliente = new ClienteNovaVersao(1, "Ana", 120);
        Comentario mensagem = new Comentario("ok!");
        Livro livro = new Livro("Livro A", 50, "Livro de suspense");
        Emprestimo emprestimo = new Emprestimo(dataDevolucao, true);
        RenovarEmprestimo renovar = new RenovarEmprestimo();
        DevolverLivro devolver = new DevolverLivro();

        System.out.println("\n --- Detalhes do Cliente: ---");
        cliente.detalhesCliente();
        mensagem.comentarLivro(cliente);
        System.out.println("\n --- Detalhes do Livro: ---");
        livro.detalhesLivro();

        try {
            emprestimo.realizarEmprestimodeLivro(cliente, livro);
            System.out.println(" \n Empréstimo realizado com sucesso!");

            // Exibir informações de empréstimo
            System.out.println("\n --- Informações do livro: --- \n" + emprestimo.informacoesEmprestimo(livro));

            // Tentar renovar o empréstimo
            renovar.renovarEmprestimo(emprestimo);

            // Devolver o livro
            //devolver.devolverLivro(emprestimo);
            emprestimo.verificarStatusEmprestimo();

        } catch (Exception e) {
            System.out.println("Erro ao realizar operação: " + e.getMessage());
            e.printStackTrace(); // Imprimir o rastreamento completo da exceção
        }
    }
}

