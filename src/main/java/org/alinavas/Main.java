package org.alinavas;

public class Main {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(checkSum(30, 2));
        //System.out.println(checkSum(3, 12));
        //System.out.println(rustamKotik(3));
        //System.out.println(rustamKotik(0));
        //System.out.println(rustamKotik(-1));
        //System.out.println(rustamSuperKotik(0));
        //System.out.println(rustamSuperKotik(-1));
        System.out.println(rustamSuperPuperKotik("Кек", 2));
        System.out.println(rustamSuperMega4kKotik(800));
        mass();


    }

    public static void printThreeWords() {

        System.out.println("Приветики\n-\nпистолетики");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 9;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицатльная");
        }
    }

    public static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Красный");

        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }

    }

    public static void compareNumbers() {
        int a = 100;
        int b = 100;
        if (a > b || a == b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a < b");
        }
    }
    /*Написать метод, принимающий на вход два целых числа и
    проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае –
    false*/

    public static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    /*
    Написать метод, которому в качестве параметра
    передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
    */
    public static String rustamKotik(int a) {
        if (a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    /*Написать метод, которому в качестве параметра
    передается целое число. Метод должен вернуть true, если
    число отрицательное, и вернуть false если положительное.*/
    public static boolean rustamSuperKotik(int a) {
        return a >= 0;
    }

    /* Написать метод, которому в качестве аргументов
    передается строка и число, метод должен отпечатать в
    консоль указанную строку, указанное количество раз;*/
    public static int rustamSuperPuperKotik(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("str=" + str);
        }
        return n ;
    }
    /*Написать метод, который определяет, является ли год
    високосным, и возвращает boolean (високосный - true, не
    високосный - false). Каждый 4-й год является високосным,
    кроме каждого 100-го, при этом каждый 400-й – високосный*/
    public static boolean rustamSuperMega4kKotik(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
    /*Задать целочисленный массив, состоящий из элементов 0 и
    1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и
    условия заменить 0 на 1, 1 на 0;*/
    public static void mass() {
        int [] nums = new int[5];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 1;
        nums[3] = 0;
        nums[4] = 1;
        System.out.println(nums);


    }

}
