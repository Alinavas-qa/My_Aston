package org.alinavas.task2;

public class Test {

    public static void main(String[] args) {
        Shape circle = new Circle(5, "черный", "белый");
        Shape triangle = new Triangle(3, 4, 2, "серый", "красный");
        Shape rectangle = new Rectangle(3, 4, "синий", "желтый");
        triangle.perimeter();
        triangle.area();
        rectangle.perimeter();
        rectangle.area();
        circle.perimeter();
        circle.area();
        circle.allInfo();
        rectangle.allInfo();
        triangle.allInfo();
    }
}
