package net.absoft.calculator;

public class QuadraticEquationCalculator {

    public Solution discriminant(int a, int b, int c) {
        int d = b * b - 4 * a * c;
        double x1 = 0;
        double x2 = 0;

        if (d < 0) {
            return null;
        } else if (d == 0) {
            x1 = -1.0d * b / (2 * a);
            x2 = x1;
        } else if (d > 0) {
            x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
            x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
        }
        Solution s = new Solution();
        s.x1 = x1;
        s.x2 = x2;
        return s;
    }

    public double sum(double x1, double x2) {
        return x1 + x2;
    }

    public static void main(String[] args) {
        QuadraticEquationCalculator calculator = new QuadraticEquationCalculator();
        double summa = calculator.sum(2, 3);
        System.out.println(summa);


    }
}
