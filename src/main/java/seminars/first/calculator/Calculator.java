package seminars.first.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    public double calculateDiscount(double price, double discount){
        if (price == 0 || discount == 0) throw new ArithmeticException();
        return price - (price * discount);
    }
}