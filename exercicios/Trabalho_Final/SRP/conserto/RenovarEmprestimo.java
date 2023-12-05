import java.time.LocalDate;

public class RenovarEmprestimo {
    
    public void renovarEmprestimo(Emprestimo emprestimo){
        if( LocalDate.now().isBefore(emprestimo.getDate())){
            System.out.println("Precisa devolver ou renovar empréstimo imediatamente");
            emprestimo.setDate(emprestimo.getDate().plusDays(7));
        } else {
            throw new IllegalArgumentException("Livro já devolvido ou empréstimo expirado");
        }
    }
}
