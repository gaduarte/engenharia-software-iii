package SRP.violacao;

import java.time.LocalDate;

public class TesteCliente {
    public static void main(String[] args) {
        LocalDate dataDevolucao = LocalDate.of(2023, 12, 2);

        Cliente cliente = new Cliente(1, "Ana", "Livro de ficção", 50, 120, "Livro C", "ok", dataDevolucao, true);

        cliente.detalhesLivro();
        cliente.comentarLivro();
        cliente.detalhesCliente();
        
        try {
            cliente.realizarEmprestimodeLivro();
            System.out.println("Empréstimo realizado com sucesso!");
  
            System.out.println(cliente.informacoesEmprestimo());

            // Verificar status do empréstimo
            cliente.verificarStatusEmprestimo();
            
            // Tentar renovar o empréstimo
            cliente.renovarEmprestimo();
            
            // Devolver o livro
            //cliente.devolverLivro();
            
            // Verificar status novamente após devolução
            cliente.verificarStatusEmprestimo();
        } catch (Exception e) {
            System.out.println("Erro ao realizar empréstimo: " + e.getMessage());
        }
        
    }
}


