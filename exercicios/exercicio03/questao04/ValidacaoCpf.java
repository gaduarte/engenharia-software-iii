package questao04;

public class ValidacaoCpf implements Validacao{
        private final String cpfContribuinte;

        public ValidacaoCpf(String cpfContribuinte){
            this.cpfContribuinte=cpfContribuinte;
        }

        @Override
        public void validar(){
            if(cpfContribuinte.isEmpty()){
                throw new IllegalArgumentException("Cpf não pode ser vazio.");
            }
        }
    }