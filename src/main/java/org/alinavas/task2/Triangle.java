package org.alinavas.task2;

public class Triangle implements Shape {

    double a, b, c, p, s;
    String fillingColor;
    String borderСolor;

    public Triangle(double a, double b, double c, String fillingColor, String borderСolor) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillingColor = fillingColor;
        this.borderСolor = borderСolor;
    }

    public void perimeter() {
        p = a + b + c;
        System.out.println("Периметр треугольника = " + p);
    }

    public void area() {
        double semiperimeter = (a + b + c) / 2;
        s = Math.sqrt (semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
        System.out.println("Площадь треугольника = " + s);
    }

    @Override
    public void allInfo() {
        System.out.println("[" + p + ", " + s + ", " + fillingColor + ", " + borderСolor + "]");
    }
}
