package codeschollandroid.b.com.myapplication;

public class Calculator implements MathOperators {
    @Override
    public double add(double num1, double num2) {
        double add = num1+ num2;
        return add;
    }

    @Override
    public double sub(double num1, double num2) {
        double sub = num1-num2;
        return sub;
    }

    @Override
    public double mul(double num1, double num2) {
        double mul = num1*num2;
        return mul;
    }

    @Override
    public double div(double num1, double num2) {
        double div = num1/num2;
        return div;
    }
}
