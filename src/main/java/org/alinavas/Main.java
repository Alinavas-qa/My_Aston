package org.alinavas;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 9;
        int sum = a + b;
        if (sum >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицатльная");

        }
    public static void printColor() {
        int value = 101;
        if (value <= 0)
            System.out.println("Красный");
        if (value > 0 && value <= 100)
            System.out.println("Желтый");
        if (value > 100)
            System.out.println("Зеленый");
    }
    public static void compareNumbers() {
        int a = 10;
        int b = 100;
        if (a > b || a == b)
            System.out.println("a >= b");
        else
            System.out.println("a < b");
    }
}
