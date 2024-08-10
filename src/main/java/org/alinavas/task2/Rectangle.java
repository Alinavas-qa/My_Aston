package org.alinavas.task2;

public class Rectangle implements Shape {

    int a, b, p, s;
    String fillingColor;
    String borderСolor;

    public Rectangle(int a, int b, String fillingColor, String borderСolor) {
        this.a = a;
        this.b = b;
        this.fillingColor = fillingColor;
        this.borderСolor = borderСolor;
    }

    public void perimeter() {
        p = (a + b) * 2;
        System.out.println("Периметр прямоугольника = " + p);
    }
    public void area(){
        s = a * b;
        System.out.println("Площадь прямоугольника = " + s);
    }

    @Override
    public void allInfo() {
        System.out.println("[" + p + ", " + s + ", " + fillingColor + ", " + borderСolor + "]");
    }
}