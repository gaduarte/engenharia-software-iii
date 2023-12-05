import java.time.LocalDate;

public class DevolverLivro {
    
    public void devolverLivro(Emprestimo emprestimo) {
        if (LocalDate.now().isAfter(emprestimo.getDate())) {
            System.out.println("Livro devolvido com atraso. Serão aplicadas penalidades.");
        } else {
            System.out.println("Devolução realizada com sucesso!");
            emprestimo.setStatus(false);
        }
    }
}
