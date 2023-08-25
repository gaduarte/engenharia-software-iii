public class NumberChecker {
    public static void checkEquality(double num1, double num2, String label1, String label2) {
        if (num1 == num2) {
            System.out.println("O " + label1 + " número é igual ao " + label2);
        }
    }

    public static void checkEquality(double num1, double num2, double num3, double num4, double num5, double num6, String label) {
        if (!(num1 == num2 && num2 == num3 && num3 == num4 && num4 == num5 && num5 == num6)) {
            throw new RuntimeException("Não são iguais.");
        }
    }
}
