package SRP.conserto;
import java.time.LocalDate;

public class TesteMain {
    public static void main(String[] args) {
        LocalDate dataDevolucao = LocalDate.of(2023, 12, 2);

        ClienteNovaVersao cliente = new ClienteNovaVersao(1, "Ana", 120);
        Comentario mensagem = new Comentario("ok!");
        Livro livro = new Livro("Livro A", 50, "Livro de suspense");
        Emprestimo emprestimo = new Emprestimo(dataDevolucao, true);

        cliente.detalhesCliente();
        mensagem.comentarLivro(cliente);
        livro.detalhesLivro();

        try {
            emprestimo.realizarEmprestimodeLivro(cliente, livro);
            System.out.println("Empréstimo realizado com sucesso!");

            // Exibir informações de empréstimo
            System.out.println(emprestimo.informacoesEmprestimo(livro));

            // Tentar renovar o empréstimo
            emprestimo.renovarEmprestimo();

            // Devolver o livro
            //emprestimo.devolverLivro();

            // Verificar status novamente após devolução
            emprestimo.verificarStatusEmprestimo();
        } catch (Exception e) {
            System.out.println("Erro ao realizar operação: " + e.getMessage());
        }
    }
}
