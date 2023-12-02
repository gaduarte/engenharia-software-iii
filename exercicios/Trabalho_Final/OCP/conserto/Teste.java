package OCP.conserto;

public class Teste {
    public static void main(String[] args){
        MedidoraNovaVersao medidora = new MedidoraNovaVersao();
        MedicaoTemperatura temperatura = new MedicaoTemperatura(2.0);
        MedirAltura altura = new MedirAltura(120.0);
        MedirComprimento comprimento = new MedirComprimento(30.0);
        MedirPressaoAtmosferica pressao = new MedirPressaoAtmosferica(1013.25);

        System.out.println("Temperatura; " + temperatura.medir());
        System.out.println("Altura; " + altura.medir());
        System.out.println("Comprimento: " + comprimento.medir());
        System.out.println("Pressão atmosférica; " + pressao.medir());
    }
}
