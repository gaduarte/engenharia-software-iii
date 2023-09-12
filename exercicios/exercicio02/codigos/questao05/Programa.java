package questao05;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2;

        System.out.print("Digite o valor 1: ");
        valor1 = scanner.nextInt();

        System.out.print("Digite o valor 2: ");
        valor2 = scanner.nextInt();

        Calculo calculo = new Calculo(valor1, valor2);

        System.out.print("Pressione Enter para calcular a média...");
        scanner.nextLine(); // Aguardar a entrada do usuário
        scanner.nextLine(); // Aguardar Enter

        int media = calculo.calcularMedia();
        System.out.println("Média: " + media);

        scanner.close();
    }
}

class Calculo {
    private int valor1;
    private int valor2;

    public Calculo(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int calcularMedia() {
        return (valor1 + valor2) / 2;
    }
}
