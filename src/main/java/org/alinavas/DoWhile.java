package org.alinavas;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//Создаем переменную класса Сканнер и ссылаем ее на объект класса сканнер, в параметрах входной поток с клавы
        int value;
        do{
            System.out.println("Ввведи 5");
            value = s.nextInt();// поместили введенное с клавы число в перемен value
        } while (value != 5);
        System.out.println("Вы ввели 5");
    }
}
/*Как работает программа:
У нас печатается надпись "Введи 5", затем мы вводим какое-то число, оно
помещается в переменную value.
Если value==5, то  выводит на экран "Вы ввели 5".
Если же вводим не 5, запускается цикл, печатается "введите 5" и так до тех пор, пока не введем 5.


*/