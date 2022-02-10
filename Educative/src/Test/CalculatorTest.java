package Test;

public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator(10, 94);

        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println(calculator.multiply());
        System.out.println(calculator.divide());

    }

}
