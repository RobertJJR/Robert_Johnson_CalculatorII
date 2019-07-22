public class CalculatorTester {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.performOperations(10.5);
        calc.performOperations("+");
        calc.performOperations(5.2);
        calc.performOperations("*");
        calc.performOperations(10);
        calc.performOperations("/");
        calc.performOperations(2);
        calc.performOperations("*");
        calc.performOperations(6);
        calc.performOperations("/");
        calc.performOperations(2);
        calc.performOperations("+");
        calc.performOperations(3);
        calc.performOperations("/");
        calc.performOperations(2);
        calc.performOperations("-");
        calc.performOperations(30);
        calc.performOperations("+");
        calc.performOperations(10);
        calc.performOperations("+");
        calc.performOperations(10);
        calc.performOperations("+");
        calc.performOperations(10);
        calc.performOperations("=");
    }
}