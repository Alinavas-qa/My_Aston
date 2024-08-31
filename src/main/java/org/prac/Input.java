package org.prac;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Класс Scanner лежит в пакете java.util, среда сама его импортирует
        //System.in - это стандартный поток входных данных, передаем его в параметрах.
        // Переменная s ссылается на объект класса Scanner
        System.out.println("Введите что-нибудь");
        String string = s.nextLine();//создаем объект класса String и ссылаем его на то, что будет получено с клав.
        // используя метод nextLine(). Т.е. мы у объекта класса Scanner вызвали метод nextLine, который считает с клав
        //одну строчку чего-нибудь
        System.out.println("Вы ввели: " + string);
        System.out.println("Введите число");
        int x = s.nextInt();
        System.out.println("Вы ввели число: " + x);

    }
}
