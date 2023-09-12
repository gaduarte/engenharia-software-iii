package questao04;

public class Calculo {
    private int id;
    private double[] numeros;

    public Calculo(int id, double[] numeros){
        this.id = id;
        this.numeros = numeros;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double numero : numeros){
            soma += numero;
        }
        double media = soma / numeros.length;
        return media;
    }

    public double calcularDesvioPadrão() {
        double media = calcularMedia();
        double somaDosQuadradosDasDiferencas = 0.0;
    
        for (double numero : numeros) {
            double diferenca = numero - media;
            somaDosQuadradosDasDiferencas += diferenca * diferenca;
        }
        
        double desvioPadrao = Math.sqrt(somaDosQuadradosDasDiferencas / numeros.length);
        return desvioPadrao;
    }
}
