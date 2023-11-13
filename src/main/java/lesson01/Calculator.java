package lesson01;

public class Calculator {
    public static int calculation(int firstOperand, int
            secondOperand, char operator) {
        int result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':

                if (secondOperand != 0) {
                    result = firstOperand / secondOperand;
                } else {
                    throw new ArithmeticException("Divided by Zero!");
                }
                break;
            default:
                throw new IllegalStateException("Unsupported operator!");
        }
        return result;
    }


}
