public class NumberEqualityTest {
    public static void main(String[] args) {
        testNumberEquality();
    }

    private static void testNumberEquality() {
        double num1 = 5.0;
        double num2 = 5.0;
        double num3 = 5.0;

        NumberChecker.checkEquality(num1, num2, "primeiro", "segundo");
        NumberChecker.checkEquality(num2, num3, "segundo", "terceiro");
        NumberChecker.checkEquality(num1, num3, "primeiro", "terceiro");
        NumberChecker.checkEquality(num1, num2, num2, num3, num3, num1, "três");
    }
}
