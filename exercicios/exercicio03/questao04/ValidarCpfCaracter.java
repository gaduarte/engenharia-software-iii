package questao04;

public class ValidarCpfCaracter implements Validacao{
        private final String cpfContribuinte;

        public ValidarCpfCaracter(String cpfContribuinte) {
            this.cpfContribuinte = cpfContribuinte;
    }
        @Override
        public void validar() {
            if (cpfContribuinte.length() != 11) {
                throw new IllegalArgumentException("CPF tem que ter 11 caracteres.");
            }
        }
            }
    
