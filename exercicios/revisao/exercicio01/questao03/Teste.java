public class Teste {
    public static void main(String[] args) {
        int lado1 = 2;
        int lado2 = 2;
        int lado3 = 2;

        try {
            Triangulo1 triangulo = new Triangulo1(lado1, lado2, lado3);
            triangulo.ehtriangulo(lado1, lado2, lado3);
            
            System.out.println("É um triângulo válido!");

            try {
                triangulo.tipoTriangulo();
            } catch (TrianguloException e) {
                System.out.println("Tipo de triângulo: " + e.getMessage());
            }

        } catch (TrianguloException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
