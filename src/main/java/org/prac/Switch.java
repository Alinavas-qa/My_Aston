package org.prac;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();

        switch (age) {// помещаем перем, которая принимает различ знач, далее начинаем перебирать эти значения
            case 0 :
                System.out.println("Ты родился");
                break; // ставится после каждого case, иначе все case будут выполняться
            case 7 :
                System.out.println("Ты пошел в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default: //если ни одно из услов не подошло, исп.этот оператор(можно без него)7, после него уже break не нужен.
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
// Оператор switch используют, чтобы не дублировать много записей if-else