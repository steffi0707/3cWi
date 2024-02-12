package at.steffi.Calculator;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        ScienceCalculator scienceCalculator = new ScienceCalculator();
        SqrtCalculator sqrtCalculator = new SqrtCalculator();

        System.out.println(calculator.divide(3, 5));
        System.out.println(scienceCalculator.cosinus(156));
        System.out.println(sqrtCalculator.sqrt(123));

        System.out.println(scienceCalculator.divide(3, 5));
        System.out.println(sqrtCalculator.divide(3, 5));


    }
}