package questao03;

public class CalculadoraImpostoDeRenda {
    public double calcularImposto(ImpostoDeRenda impostodeRenda) {
        double rendaTotal =
        impostodeRenda.getRendimentos().stream().mapToDouble(Double::doubleValue).sum();
        double despesaTotal =
        impostodeRenda.getDespesas().stream().mapToDouble(Double::doubleValue).sum();
        double baseCalculo = rendaTotal - despesaTotal;
        if (baseCalculo <= 1903.98) {
            return 0.0;
        }
        if (baseCalculo <= 2826.65) {
            return baseCalculo * 0.075 - 142.80;
        }
        return baseCalculo * 0.275 - 869.36; 
        }
}
