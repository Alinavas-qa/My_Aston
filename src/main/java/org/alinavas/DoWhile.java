package org.alinavas;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);//Создаем переменную s класса Scanner и ссылаем ее на объект класса Scanner,
        // в параметрах входной поток с клавы
        int value;
        do {
            System.out.println("Ввведи 5");
            value = s.nextInt();// вводим число, поместили введенное с клавы число в переменную value
        } while (value != 5);
        System.out.println("Вы ввели 5");
    }
}
/*Как работает программа:
У нас печатается надпись "Введи 5", затем мы вводим какое-то число, оно
помещается в переменную value.
Если value==5, то  выводит на экран "Вы ввели 5".
Если же вводим не 5, запускается цикл, печатается "введите 5" и так до тех пор, пока не введем 5.
while (value != 5)-если true, в очеред.раз выполн тело цикла как минимум 1 раз
*/