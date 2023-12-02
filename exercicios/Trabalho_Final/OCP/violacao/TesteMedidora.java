package OCP.violacao;

public class TesteMedidora {
    public static void main(String[] args) {
        Medidora medidora = new Medidora(10.0);

        double temperatura = medidora.medirTemperatura();
        System.out.println("Temperatura: " + temperatura);

        double pressao = medidora.medirPressaoAtmosferica();
        System.out.println("Pressão Atmosférica: " + pressao);

        double altura = medidora.medirAltura();
        System.out.println("Altura: " + altura);

        double comprimento = medidora.medirComprimento();
        System.out.println("Comprimento: " + comprimento);
    }
}
