package Komputer;

public class ArithmeticCalculator {
    private int number1;
    private int number2;

    public ArithmeticCalculator(int number2, int number1) {
        this.number2 = number2;
        this.number1 = number1;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }
    public void calculate(Operation operation) {
        if(operation == Operation.ADD) {
            System.out.println(number1 + number2);
        } else if(operation == Operation.SUBTRACT) {
            System.out.println(number1 - number2);
        } else if(operation == Operation.MULTIPLY) {
            System.out.println(number1 * number2);
        } else {
            System.out.println("Invalid operation");
        }
    }
}
