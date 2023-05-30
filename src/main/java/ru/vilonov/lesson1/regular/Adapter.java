package ru.vilonov.lesson1.regular;

public class Adapter {
    Calculator calculator = new Calculator();

    /**
     *
     * @param x first num
     * @param y second num
     * @return int result (x + y)
     */
    public void sum (int x,int y) {
        int result = calculator.sum(x,y);
        System.out.println("Result sum: " + result);
    }
    public void sub (int x,int y) {
        int result = calculator.sub(x,y);
        System.out.println("Result sub: " + result);
    }
    public void div (int x,int y) {
        int result = calculator.div(x,y);
        System.out.println("Result div: " + result);

    }public void mult (int x,int y) {
        int result = calculator.mult(x,y);
        System.out.println("Result mult: " + result);
    }
}
