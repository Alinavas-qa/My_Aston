package org.alinavas.task2;

public class Circle implements Shape {

    double r;
    String fillingColor;
    String borderСolor;
    double l;
    double s;

    public Circle(double r, String fillingColor, String borderСolor) {
        this.r = r;
        this.fillingColor = fillingColor;
        this.borderСolor = borderСolor;
    }

    public void perimeter() {
        l = 2 * Math.PI * r;
        System.out.println("Длина окружности по заданному радиусу = " + l);
    }
    public void area(){
        s = Math.PI * r * r;
        System.out.println("Периметр окружности по заданному радиусу = " + s);
    }

    @Override
    public void allInfo() {
        System.out.println("[" + l + ", " + s + ", " + fillingColor + ", " + borderСolor + "]");
    }
}
