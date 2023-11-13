package lesson01;

public class Application {
    public static void main(String[] args) {
        int firstOperand = 1;
        int secondOperand = 2;
        char operator = '_';
        System.out.printf("Result of %d %c %d = %d",firstOperand, operator, secondOperand,
                Calculator.calculation(firstOperand,secondOperand,operator));

    }
}
