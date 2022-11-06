package net.absoft.calculator;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int perimeter() {
        int p = a + b + c;
        return p;

    }

    public String type() {
        String type1 = "Isosceles triangle";
        String type2 = "Versatile triangle";

        if (a == b) {
            return type1;
        } else if (b == c) {
            return type1;
        } else if (a == c) {
            return type1;
        } else {
            return type2;
        }

    }
}
