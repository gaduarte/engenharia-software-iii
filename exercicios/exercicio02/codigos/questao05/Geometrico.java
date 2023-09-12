package questao05;

/* Coesão Coincidental. */

public class Geometrico {
    private int lado;

    public Geometrico(int lado){
        this.lado=lado;
    }

    public int getLado(){
        return lado;
    }

    public String converterInteiroEmString(int lado) {
            return String.valueOf(lado);
        }


    public void enviarEmail(String destinatario, String mensagem) {
        
    }

}

  class Quadrado extends Geometrico{
        public Quadrado(int lado){
            super(lado);
        }
        public void atualizarBancodeDados(String tabela, String dados){

        }
    }
