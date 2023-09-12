package questao04;


public class RemoverEspaço {
    private String texto;

    public RemoverEspaço(String texto){
        this.texto=texto;
    }

    public String removerEspacos() {
        return texto.replaceAll("\\s+", "");
        }
    public String[] quebrarEmPalavras() {
        return texto.split("\\s+");
        }
}
