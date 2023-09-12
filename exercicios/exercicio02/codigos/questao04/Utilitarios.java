package questao04;

import java.util.Arrays;

public class Utilitarios {
    public static void main(String[] args) {
        // Teste da classe Calculo
        double[] numeros = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        Calculo calculo = new Calculo(1, numeros);
        
        double media = calculo.calcularMedia();
        double desvioPadrao = calculo.calcularDesvioPadrão();
        
        System.out.println("Média: " + media);
        System.out.println("Desvio Padrão: " + desvioPadrao);

        // Teste da classe Ordenacao
        int[] array = { 5, 2, 8, 1, 9 };
        Ordenacao ordenacao = new Ordenacao();
        
        System.out.println("Array antes da ordenação: " + Arrays.toString(array));
        ordenacao.ordenar(array);
        System.out.println("Array depois da ordenação: " + Arrays.toString(array));

        // Teste da classe RemoverEspaco
        String texto = "Este é um exemplo de texto";
        RemoverEspaço removerEspaco = new RemoverEspaço(texto);
        
        String textoSemEspacos = removerEspaco.removerEspacos();
        String[] palavras = removerEspaco.quebrarEmPalavras();
        
        System.out.println("Texto sem espaços: " + textoSemEspacos);
        System.out.println("Palavras do texto: " + Arrays.toString(palavras));
    }
}



 